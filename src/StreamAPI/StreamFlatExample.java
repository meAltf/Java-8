package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;


/**
 * Stream API : flatMap()
 * - IT converts(Transform) one type to another as like map() method
 * USed in the context of stream where each element in the stream represents multiple elements
 * Example-
 *  Each stream element represents multiple element
 *      - Stream<List>
 *      - Stream<Arrays>
 *
 *  -- distinct(), count(), sorted()
 *  Distinct returns a stream with unique elements
 *  Count returns a long with the total no of elements in the stream
 *  Sorted - sort the elements in the stream
 */

public class StreamFlatExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //<Stream<String>
                .collect(toList());

        return studentActivities;
    }

    public static List<String> printUniqueStudentActivities() {

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;

    }

    public static long getStudentActivitiesCount() {

        long totalActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return totalActivities;

    }

    public static List<String> getStudentActivitiesSorted() { // getting result in alphabetical order of string

        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;

    }

    public static void main(String[] args) {
        System.out.println("PrintStudent Activities : " + printStudentActivities());
        System.out.println("Unique Student Activities : " + printUniqueStudentActivities());
        System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());
        System.out.println("Sorted order of student's activities : " + getStudentActivitiesSorted());
    }
}

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

    public static void main(String[] args) {
        System.out.println("PrintStudent Activities : " + printStudentActivities());
    }
}

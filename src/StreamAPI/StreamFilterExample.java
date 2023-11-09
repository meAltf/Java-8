package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Stream API- filter()
 * filter- Filters the elements in the stream
 * -- Input to the filter is a Predicate Functional interface
 */
public class StreamFilterExample {

    public static List<Student> filterStudents(){

        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter((student -> student.getGender().equals("female"))) //Stream<Student>
                //filters and sends only the students whose gender is female only
                .filter(student -> student.getGpa() >= 3.9)
                .collect(toList());
    }

    public static void main(String[] args) {

        System.out.println("Filter students : " + filterStudents());
//        System.out.println("Filter students : " + filterStudents());

    }



}

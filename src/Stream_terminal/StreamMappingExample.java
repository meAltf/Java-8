package Stream_terminal;
import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Terminal Operation - mapping()
 *
 * - Mapping() collector applies a transformation function first add then collects the data in a collection (could be any type of collection)
 *
 */

public class StreamMappingExample {

    public static void main(String[] args) {

        /* this takes one extra map interface to perform that operation
        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());

         */

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet())); // this avoids the additional map intermediate operation.

        System.out.println("namesSet : " + namesSet);

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList())); // this avoids the additional map intermediate operation.

        System.out.println("namesList : " + namesList);
    }
}

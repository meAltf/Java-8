package Stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Terminal Operations- maxBy(), minBy()
 *
 * - Comparator as an input parameter and Optional as an output
 *
 * - maxBy()--
 *      - THis collector is used in conjunction with comparator.
 *      - Returns the max element based on the property passed to the comparator
 *
 * - minBy()--
 *      - THis collector is used in conjunction with comparator.
 *      - Returns the smallest element based on the property passed to the comparator.
 */

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy(){

        Optional<Student> studentOptional = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

        return studentOptional;
    }

    public static Optional<Student> maxBy(){

        Optional<Student> studentOptional = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

        return studentOptional;
    }

    public static void main(String[] args) {

        System.out.println(minBy());

        System.out.println(maxBy());
    }
}

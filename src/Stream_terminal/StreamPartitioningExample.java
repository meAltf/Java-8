package Stream_terminal;

import java.util.*;
import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

/**
 * Terminal Operations - partitioningBy()
 *
 * - partitioningBy() collector is also of groupingBy()
 *
 * - partitioningBy() accepts a predicate as an input
 *
 * - return type of the collector is going to be Map<K,v>
 *      - the key of the return type is going to be a Boolean.
 *
 * - There are two different version of partitioningBy()
 *          - partitioningBy(predicate)
 *          -partitioningBy(predicate, downstream) // downstream -> could be of any collector..
 */

public class StreamPartitioningExample {

    public static void partitioningBy_1(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));

        System.out.println("studentMap : " + studentMap);

    }

    public static void partitioningBy_2(){

        Predicate<Student> gpaPredicate = (student) -> student.getGpa()>=3.8;

        Map<Boolean,Set<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toSet()));

        System.out.println("studentMap : " + studentMap);

    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
        //partitioningBy_3();
    }
}

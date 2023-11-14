package Stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/**
 * Terminal Operations - groupingBy()
 *
 * - groupingBy() collector is equivalent to the groupBy() operation in SQL
 *
 * - USed to group the element based on the property
 *
 * - The output of the groupingBy() is going to be a Map<K,V>
 *
 * - THere are three different versions of groupingBy()
 *      -groupingBy(classifier)
 *      -groupingBy(classifier, downstream)
 *      -groupingBy(classifier, supplier, downstream)
 */

public class StreamGroupingByExample {

    public static void groupingByGender(){

        Map<String,List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        Stream.of(studentMap).forEach(System.out::println);
    }

    public  static void customizedGroupingBy(){

        Map<String,List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE"));

        Stream.of(studentMap).forEach(System.out::println);
    }

    public static void main(String[] args) {

        //groupingByGender();
        customizedGroupingBy();
    }
}

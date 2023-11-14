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

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping(){

        Map<Integer,  Map<String,List<Student>>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa()>= 3.8 ?  "OUTSTANDING" : "AVERAGE")));

        Stream.of(studentMap).forEach(System.out::println);

    }

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping_2(){

        Map<String,Integer> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));// second argument can be of any type of collector

        System.out.println(nameNoteBooksMap);
    }

    /**
     * Grouping by Two parameters
     */
    public  static void twoLevelGrouping_3(){

        Map<String,Set<Student>> nameNoteBooksMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,
                        toSet()));// second argument can be of any type of collector

        System.out.println(nameNoteBooksMap);
    }


    public static void threeArgumentGroupingBy(){

        LinkedHashMap<String,Set<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName,LinkedHashMap::new,
                        toSet()));

        System.out.println(" studentMap : " + studentMap);
    }


    public static void main(String[] args) {

        //groupingByGender();
        //customizedGroupingBy();
        twoLevelGrouping();
        //twoLevelGrouping_2();
        //twoLevelGrouping_3();
        // threeArgumentGroupingBy();
    }
}
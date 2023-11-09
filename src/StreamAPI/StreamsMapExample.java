package StreamAPI;


import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Stream API : map() --->
 * map : Convert(transform) one type to another
 * Don't get confused this with Map collection
 */
public class StreamsMapExample {

    public static List<String> namesList(){

        List<String> studentList = StudentDataBase.getAllStudents().stream() // Stream<Student>
                //Student as an input -> Student Name as a output
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toList()); // List<String>
        return studentList;
    }

    public static Set<String> namesSet(){

        Set<String> studentList = (Set<String>) StudentDataBase.getAllStudents().stream() // Stream<Student>
                //Student as an input -> Student Name as a output
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
                .collect(toSet()); // List<String>
        return studentList;
    }

    public static void main(String[] args) {

        System.out.println(namesList());
        System.out.println(namesSet());

    }
}

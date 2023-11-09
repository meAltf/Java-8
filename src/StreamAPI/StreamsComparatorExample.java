package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsComparatorExample {

    public static List<Student> sorteStudentsByName(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sorteStudentsByGpa(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sorteStudentsByGpaDesc(){

        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed()) // reversed() going to modify result in descending order.
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name : ");
        sorteStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by Gpa : ");
        sorteStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by Gpa in Descending order: ");
        sorteStudentsByGpaDesc().forEach(System.out::println);
    }
}

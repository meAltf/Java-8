package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {


    public static void main(String[] args) {

        // Student name and there activities in a map
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >=3);
        Predicate<Student> studentgpaPredicate = (student -> student.getGradeLevel() >=3.9);

        Map<String,List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                //.filter((student -> student.getGradeLevel() >=3))  //enhancing this using adding more conditions..
                .filter(studentPredicate) // Stream of Students
                .filter(studentgpaPredicate) // Stream of Students
                .collect(Collectors.toMap(Student::getName, Student::getActivities)); // Map of filtering students
        /**
         * Collect method is something which start stream either non of the method starting..
         * Keep in mind this..
         */

        System.out.println(studentMap);
    }
}

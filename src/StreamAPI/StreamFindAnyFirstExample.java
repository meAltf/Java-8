package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

/**
 * Stream API - findFirst() and findAny()
 *
 * - used to find an element in the stream
 * - Both the function returns the result of type optional
 *
 * findFirst()- Returns first element in the stream
 * findAny() - Returns the first encountered element in the stream
 *
 */
public class StreamFindAnyFirstExample {

    public static Optional<Student> findAny(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findAny();
    }

    public static Optional<Student> findFirst(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.8)
                .findFirst();
    }

    public static void main(String[] args) {

        Optional<Student> findAnyStudent = findAny();
        if(findAnyStudent.isPresent()){
            System.out.println("Student is :" + findAnyStudent.get());
        }else{
            System.out.println("No Student Found");
        }

        Optional<Student> findFirst = findFirst();
        if(findFirst.isPresent()){
            System.out.println("Student is :" + findFirst.get());
        }else{
            System.out.println("No Student Found");
        }
        //it will make a lot of different during parallel stream

    }
}

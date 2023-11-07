package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
        System.out.println("Filter students by their Grade Level");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> { //Predicate<Student> p1 = (s) -> s.getGradeLevel() >3;

            if (p1.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa(){
        System.out.println("Filter students by their Grade Level");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> { //p2 = (s) -> s.getGpa() >= 3.9;

            if (p2.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents(){
        System.out.println("Filter students");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> { //Predicate<Student> p1 = (s) -> s.getGradeLevel() >3; and p2 = (s) -> s.getGpa() >= 3.9;

            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents2(){
        System.out.println("Filter students-2");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> { ////Predicate<Student> p1 = (s) -> s.getGradeLevel() >3; or p2 = (s) -> s.getGpa() >= 3.9;

            if (p1.or(p2).test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents3(){
        System.out.println("Filter students-3");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> { // //Predicate<Student> p1 = (s) -> s.getGradeLevel() >3; or + negate p2 = (s) -> s.getGpa() >= 3.9;

            if (p1.or(p2).negate().test(student)) {
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {

        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
        filterStudents2();
        filterStudents3();

    }
}

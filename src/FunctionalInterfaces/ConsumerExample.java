package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName(){

        /**
         * Instead of writing c3 and c4 again and again, it arises code duplication and also somewhat error
         * so better if we put these lines above to prevent from error and code duplication
         */
//        Consumer<Student> c2 = (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities(){

        System.out.println("printNameAndActivities :");

        /**
         * Instead of writing c3 and c4 again and again, it arises code duplication and also somewhat error
         * so better if we put these lines above to prevent from error and code duplication
         */
//        Consumer<Student> c3 = (student) -> System.out.println(student.getName());
//        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4).andThen(c2)); // it is called Consumer chaining

    }

    public static void printNameAndActivitiesUsingCondition(){

        System.out.println("PrintNameAndActivitiesUsingCondition :");

        /**
         * Instead of writing c3 and c4 again and again, it arises code duplication and also somewhat error
         * so better if we put these lines above to prevent from error and code duplication
         */
//        Consumer<Student> c3 = (student) -> System.out.println(student.getName());
//        Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c3.andThen(c4).accept(student);
            }
        }));

    }

    public static void main(String[] args) {

        Consumer<String> c1 = (str) -> System.out.println(str.toUpperCase());
        c1.accept("alataf start learning java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}

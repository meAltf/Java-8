package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    //Real time use of BiConsumer of studentDataBase to filter some meaningful output
    public static void nameAndActivities(){

        //BiConsumer<String,String> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        /**
         * // it doesn't support anymore for a collection of string as string, now we need to use collection of string as taken as List
         */

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String,String> biConsumer = (a,b) ->{
            System.out.println("a :" + a + " , b : "+ b);
        };
        //Passing the argument to biConsumer functional interface
        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer,Integer> multiply = (a,b) ->{
            System.out.println("Multiplication is :" + (a*b));
        };
        //multiply.accept(10,7);

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println(("Division is : " + (a/b)));
        };
        //division.accept(50,5);

        //Now using .andThen() to perform operation
        multiply.andThen(division).accept(60,6);

        nameAndActivities();
    }

}

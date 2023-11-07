package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class supplierExample {

    /**
     * Supplier Functional Interface
     * doesn't take any input parameters but it return a output parameter
     * means it is opposite to "consumer" functional interface because
     * it takes input parameter but doesn't return any output parameters.
     */

    public static Supplier<Student> studentSupplier = () -> {
        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    public static  Supplier<List<Student>> studentsSupplier = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        Student student = studentSupplier.get();

        System.out.println("Student is : " + student);

        System.out.println("Students are : " + studentsSupplier.get());
    }
}

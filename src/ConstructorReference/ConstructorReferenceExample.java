package ConstructorReference;

import data.Student;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSuppllier = Student::new;

    static Function<String, Student> studentFunction = Student::new;

    public static void main(String[] args) {
        System.out.println(studentSuppllier.get()); // it return null value at the place of the name

        System.out.println(studentFunction.apply("Alataf")); // but it return the name which we pass at the place of the name

    }
}

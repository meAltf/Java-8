package StreamAPI;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Stream API - reduce()
 * - This is a terminal operation.
 * Used to reduce the contents of a stream to a single value
 *
 * --- used this when you need to perform sum of all stream member or multiplication of all stream member or find fourth highest in the stream
 *
 * It take two parameters as an input
 * - First parameter -- default ot initial value
 * - Second parameter -- BinaryOperator<T>
 *
 */

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){

        //1
        //3
        //5
        //7
        return integerList.stream()
                .reduce(1, (a,b) -> a*b); // 1 is taking as default

    }

    public static Optional<Integer> performMultiplicationWithNoInitialValue(List<Integer> integerList){

        return integerList.stream()
                .reduce( (a,b) -> a*b); // performs multiplication for each element in the stream and returns a new result fo.
    }

    public static Optional<Student> getHighestGradeStudent(){

        Optional<Student> studentOptional =  StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa()) ? s1 : s2);
        return studentOptional;
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithNoInitialValue(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithNoInitialValue(integers1);
        System.out.println(result1.isPresent());

        if(result1.isPresent()){
            System.out.println(result1.get());
        }

        System.out.println(getHighestGradeStudent().get());
    }
}

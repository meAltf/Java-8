package Stream_terminal;

import data.StudentDataBase;

import java.util.stream.Collectors;

/**
 * Terminal Operations - counting()
 *
 * - counting() Collector returns the total number of elements as a result.
 */

public class StreamCountingExample {

    public static long count(){
        return  StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println(count());
    }
}

package Stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

/**
 * Stream Terminal operations
 * -Terminal Operations collects the data for you
 * -Terminal Operations starts the whole stream pipeline.
 *
 * - Terminal Operartions
 * -forEach()
 * -min()
 * -max()
 * -reduce()
 * -collect() and etc..
 *
 * Terminal Operation - collect()
 *
 *  - The COLLECT() method takes in an input of type Collector
 *  - Produces the result as per the input passed to the collect() method.
 *
 *  Terminal Operations - joining()
 *  - joining() Collector performs th eString concatenation on the elements in the stream.
 *  - joining() has three different overloaded versions
 */
public class StreamJoiningExample {

    public static String joining(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining()); // appends all the strings to produce the output,
    }

    public static String joiningWithDelimiter(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joiningWithDelimiterWithPrefix(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","[","]"));
    }

    public static void main(String[] args) {

        System.out.println("Names : "+ joining());
        System.out.println("Names With Delimiter : "+ joiningWithDelimiter());
        System.out.println("Names With Delimiter Prefix and Suffix : "+ joiningWithDelimiterWithPrefix());
    }
}

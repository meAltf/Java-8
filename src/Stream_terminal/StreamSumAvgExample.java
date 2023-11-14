package Stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

/**
 * Terminal Operations - summingInt(), averageInt()
 *
 * - summingInt() - this collector return the sum as a result.
 *
 * -averageInt() - this collector returns the average as a result.
 */
public class StreamSumAvgExample {

    public static int sum(){

        int totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }

    public static double average(){

        double totalNoOfNotebooks = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));

        return totalNoOfNotebooks;
    }


    public static void main(String[] args) {


        System.out.println("Total no of Notebooks : " + sum());

        System.out.println("Average no of Notebooks : " + average());
    }
}

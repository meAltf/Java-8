package StreamAPI;

import data.StudentDataBase;

/**
 * Stream API  : anyMatch(), allMatch(), noneMatch()x
 *
 * - All these functions takes in a predicate as an input and returns a Boolean as an input
 *
 * anyMatch()- Returns TRUE if any one of the element matches the predicate, otherwise else
 *
 * allMatch()- Returns TRUE if all the elements in the stream matches the predicate, otherwise false
 *
 * noneMatch()- Just opposite to allMatch().
 *              - Return s TRUE if none of the elements in the stream matches the predicate, otherwise false
 */

public class StreamMatchExample {

    public static boolean allMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static boolean anyMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static boolean noneMatch(){

        boolean result = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=3.9);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Result of allMatch : " + allMatch());
        System.out.println("Result of anyMatch : " + anyMatch());
        System.out.println("Result of noneMatch : " + noneMatch());
    }
}

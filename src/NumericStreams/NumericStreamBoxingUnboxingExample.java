package NumericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Numeric Stream : Boxing() and UnBoxing()
 *
 * Boxing()-
 *  - Converting a primitive type to Wrapper class type
 *
 *  Example-
 *  - Converting an int(Primitive) to Integer(Wrapper)
 *
 * UnBoxing()-
 *  - Converting a Wrapper class type to primitive type
 *
 *  Example-
 *  - Converting an Integer(Wrapper) to int(Primitive)
 */
public class NumericStreamBoxingUnboxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10) // Intstream of 10 elements
                //int- input
                .boxed()
                //Integer- output
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        //wrapper to primitive
        return integerList.stream()
        //wrapper Integer values
        .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Converting PrimitiveStream to List : "+ boxing());

        List<Integer> integers = boxing();

        System.out.println("Sum using Unboding : "  + unBoxing(integers));

    }
}

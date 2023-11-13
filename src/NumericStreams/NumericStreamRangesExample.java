package NumericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * IntStream | LongStream -
 *  IntStream.range(a,b) | LongStream.range(a,b) -> Return an IntStream|LongStream of (b-1) elements means b is excluded.
 *  IntStream.rangeClosed(a,b) | LongStream.rangeClosed(a,b) -> Return an IntStream|LongStream of till b elements means b in included.
 *
 *  DoubleStream -
 *  - It does not support the range() and rangeClosed().
 */

public class NumericStreamRangesExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.range(1,50);
        System.out.println("Total number of elements : " + intStream.count());
        //intStream.forEach(System.out::print); // stream closed error
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));
        System.out.println();
        System.out.println("Total no of elements using rangeClosed :" +IntStream.rangeClosed(1,50).count());

        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        //asDoubleStream
        System.out.println();
        LongStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));

        //.asDoubleStream() works with both IntStream.rangeClosed and LongStream.rangeClosed()...
    }
}

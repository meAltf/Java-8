package ParallelStreams;

import java.util.stream.IntStream;

public class parallelStreamExample {

    public static int sum_sequential_stream(){

        int total = IntStream.rangeClosed(1,1000000)
                .sum();
        return total;

    }

    public static int sum_parallel_stream(){

        int total = IntStream.rangeClosed(1,1000000)
                .parallel() // splits the data in to multiple parts //775057
                .sum();//performs the sum of the individual parts and consolidate the result.
        return total;
    }

    public static void main(String[] args) {

        System.out.println(sum_sequential_stream());
        System.out.println(sum_parallel_stream());

    }
}

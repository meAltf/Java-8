package ParallelStreams;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum=new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum); //result is : 500500

            //448461
            //497950
            //499789
            // Everytime it gives different answer that's not we want
            // so whenever you have a muttable variable don't used parallel stream because it gives wrong answer

        System.out.println(sum.getTotal());
    }
}

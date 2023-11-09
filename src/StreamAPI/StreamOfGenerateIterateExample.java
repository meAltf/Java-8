package StreamAPI;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Streams API - of() | iterate() | generate()
 *
 * of() - > Creates a stream of certain values passed to this method
 * Example-
 *  Stream<String> stringStream = Stream.of("alataf", "ansari", "warish");
 *
 *  iterate(), generate() -> USed to create infinite Streams.
 *  Example-
 *  Stream.iterate(1, x->x*2)
 *
 *  Example-
 *  Stream.generate(<Supplier>)
 *
 */
public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("alataf", "ansari", "warish");
        stringStream.forEach(System.out::println);

        List<Integer> integerList  = Stream.iterate(1, x->x*2)
                .limit(10)
               // .map(Integer::new)
                .collect(toList());

        System.out.println("iterate : " + integerList);


        Supplier<Integer> supplier = new Random()::nextInt;

        List<Integer> integerList1  = Stream.generate(supplier)
                .limit(10)
                .collect(toList());
        System.out.println("generate : " + integerList1);

    }


}

package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("alataf");
        names.add("ansari");
        names.add("warish");

        for(String name: names){
            System.out.println(name);
        }
        for(String name: names){
            System.out.println(name);
        }

        names.remove(0);
        System.out.println(names);

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println);

    }
}

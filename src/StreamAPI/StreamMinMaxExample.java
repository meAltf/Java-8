package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (a,b) -> a>b ? a : b);
    }

    public static Optional<Integer> maxValue(List<Integer> integerList){
        return integerList.stream()
                //.reduce(0,(a,b)->(a>b) ? a : b);
                .reduce(Integer::max);
    }

    public static int findMinValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (a,b) -> a<b ? a : b);
    }

    public static Optional<Integer> minValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->(a<b) ? a : b);
        //.reduce(0,Integer::min);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6,7,8,9,10);

        //List<Integer> integerList = new ArrayList<>(); // check it on empty list then you find the difference of using (optional)

        Optional<Integer> maxValue =maxValue(integers);
        int max = maxValue.isPresent() ? maxValue.get():0;
        System.out.println("Max Value is : " + max);

        Optional<Integer> minValue =minValue(integers);
        int min = maxValue.isPresent() ? minValue.get():0;
        System.out.println("Min Value is : " + min);
    }

}

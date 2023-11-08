import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.reverseOrder;

public class question {

    public static void main(String[] args) {

        int[] salaries = {1200, 3000, 5000, 4000, 2200, 5500};
        int result = Arrays.stream(salaries)
                .sorted()
                .skip(3)
                .findFirst()
                .getAsInt();

        System.out.println(result);
    }
}

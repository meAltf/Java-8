package FunctionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println("Result is : " + function.apply("java-startt"));

        System.out.println("Result of another is " + function.andThen(addSomeString).apply("java-starting"));
        /**
         * andThen() interface- first execute first function then second function ||
         * means it first execute (function) here then going to execute (addSomeString)
         */
        System.out.println("Result of compose is : " + function.compose(addSomeString).apply("java-start but"));
        /**
         * compose() interface - it first execute that function which is inside compose then execute the first function which
         * is before the compose inteface ||
         * means it first execute (addSomeString) then execute (function)
         */
    }
}

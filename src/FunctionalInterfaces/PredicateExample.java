package FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> { return i%2==0; };
    static Predicate<Integer> p1 = (i) -> i%2==0;
    static Predicate<Integer> p2 = (i) -> i%5==0;

    public static void predicateAnd(){
        System.out.println("Predicate And result is : " + p1.and(p2).test(100)); // Predicate chaining
        System.out.println("Predicate And result is : " + p1.and(p2).test(25)); // Predicate chaining
    }

    public static void predicateOr(){
        System.out.println("Predicate Or result is : " + p1.and(p2).test(100)); // Predicate chaining
        System.out.println("Predicate Or result is : " + p1.and(p2).test(25)); // Predicate chaining
    }

    public static void predicateNegate(){
        System.out.println("Predicate And result is : " + p1.and(p2).test(95)); // Predicate chaining
        //System.out.println("Predicate And result is : " + p1.and(p2).test(25)); // Predicate chaining
    }


    public static void main(String[] args) {

        /**
         * Instead if writing this functional interface again and again better to put it
         * outside of the main function and use it many times without any error and redundancy
         */
        //Predicate<Integer> p = (i) -> { return i%2==0; }; //it is going to check (i) will be even or not
        System.out.println(100);
        //Predicate<Integer> p1 = (i) -> i%2==0;  // Re-write above line
        System.out.println(100);

        //calling the above functional Interface
        predicateAnd();
        predicateOr();
        predicateNegate();



    }
}

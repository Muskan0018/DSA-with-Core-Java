package StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIExampleTwo {
    public static void main(String[] args) {
        List<Integer> digit = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 6);

// Predicate - A functional interface used to define a condition for filtering elements. It uses test() method.

        Predicate<Integer> p = n -> n % 2 == 0;

        // Predicate<Integer> p = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //         return n % 2 == 0;
        //     }
        // };

// Function - A functional interface used to define a transformation operation on elements. it uses apply() method.
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            public Integer apply(Integer n) {
                return n * 2;
            }
        };

        Stream<Integer> sortedValues = digit.stream()
                .filter(p)
                .sorted();


        // int result = digit.stream()
        //         .filter(p)
        //         .map(f)
        //         .reduce(0, (a, b) -> a + b);

        // System.out.println(result);

        sortedValues.forEach(n -> System.out.println(n));
    }
}

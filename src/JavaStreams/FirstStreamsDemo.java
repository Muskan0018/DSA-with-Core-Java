package JavaStreams;


/*
* STREAM PIPELINE
*    SOURCE --> INTERMEDIATE OPERATIONS (LAZY OPERATIONS) --> TERMINAL OPERATIONS
*
* */

// Streams --> Assembly line / Pipeline


import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstStreamsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // LIST: EVEN NUMBERS from "numbers" list

        // without using STREAMS
        List<Integer> evenNumbers1 = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers1.add(num);
            }
        }
        System.out.println("Even Numbers without Streams: " + evenNumbers1);

        // Using STREAMS
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p);
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even Number with Streams: " + evenNumbers2);
    }

    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder = integer % 2;
            if (remainder == 0)
                return true;
            return false;
        }
    };
}

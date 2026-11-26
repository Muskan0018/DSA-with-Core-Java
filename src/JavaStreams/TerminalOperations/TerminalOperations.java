package JavaStreams.TerminalOperations;

//Terminal Operations are ran after the Intermediate Operations

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
/* reduce() - Used to combine all elements into a single value by repeatedly applying an operation.
            acc → accumulator (stores the running result)
            curr → current element
            0 → initial value
        Common uses: sum, product, maximum, grouping, combining data.
 */
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Stream<Integer> integerStream = numbers.stream();
//        int sum = integerStream.reduce(0, (acc, num) -> acc + num);    // OR below
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("Sum of given numbers: " + sum);

     // Shorthand method
        int total = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("(By using shorthand method) total : " + total);

        // collect() - In Java Streams, collect() is used to gather stream elements into a collection or another result.
        // find() - Finds the first element that satisfies a condition.
        // match() - Used mainly with strings to match a pattern (usually a regular expression).
        /* iteration()- Iteration means going through elements one by one.
          Common Methods:
               forEach() - Performs an action on each element
               for...of	- Loops through iterable values
               map() - Transforms elements
               filter() - Selects elements based on a condition
         */
    }
}

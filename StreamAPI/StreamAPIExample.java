// Stream - A stream is a sequence of elements supporting sequential and parallel aggregate operations.


package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {
    public static void main(String[] args) {
        
     List<Integer> number = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 6);

    //  Stream<Integer> s1 = number.stream();

     // filter() method to filter elements based on a condition
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

     // map() method to transform elements   
        // Stream<Integer> s3 = number.stream().map(n -> n * n);

     // reduce() method to perform a reduction operation on the elements
        // int sum = number.stream().reduce(0, (a, b) -> a + b);
        // System.out.println("Sum: " + sum);

        int result = number.stream()                     
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);
           
        System.out.println(result);        
       
        // s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));   // IllegalStateException: stream has already been operated upon or closed
    }
}

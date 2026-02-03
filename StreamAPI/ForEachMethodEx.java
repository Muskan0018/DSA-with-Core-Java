package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachMethodEx {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 6);

        Consumer<Integer> con = n -> System.out.print(n + " ");

        // Consumer<Integer> con = new Consumer<Integer>() {

        //     public void accept(Integer n)
        //     {
        //         System.out.print(n + " ");
        //     }
        // };

        num.forEach(con);

        // nums.forEach(n -> System.out.print(n + " "));

    }
}

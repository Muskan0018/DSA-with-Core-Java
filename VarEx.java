// Var in Java - Local Variable Type Inference 

import java.util.*;

public class VarEx {
    public static void main(String[] args) {
        // Using 'var' for local variable type inference
        var message = "Hello, World!";
        System.out.println(message);

        var numbers = List.of(1, 2, 3, 4, 5);
        for (var number : numbers) {
            System.out.println(number);
        }

        var map = new HashMap<String, Integer>();
        map.put("One", 1);
        map.put("Two", 2);
        System.out.println(map);
    }
}

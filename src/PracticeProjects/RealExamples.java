package PracticeProjects;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

// Using BiFunction

public class RealExamples {
    public static void main(String[] args) {
        // <title> costs $<price>

// BiFunction
        BiFunction<String, Double, String> formatter = (title, price) -> title + " cost $" + price;
        System.out.println(formatter.apply("Harry Potter", 1999.68));
        System.out.println(formatter.apply("Love Hypothesis", 99.68));
        System.out.println(formatter.apply("Happy Hippos", 9.68));
        System.out.println(formatter.apply("Shinchan", 89.68));

// BiConsumer
        BiConsumer<String, Double> formatterConsumer = (title, price) -> System.out.println(title + " cost $" + price);
        formatterConsumer.accept("Harry Potter", 1999.68);
        formatterConsumer.accept("Love Hypothesis", 99.68);
        formatterConsumer.accept("Happy Hippos", 9.68);
        formatterConsumer.accept("Shinchan", 89.68);

        // is Expensive or not
// Predicate
        Predicate<Double> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(900.3));
    }
}

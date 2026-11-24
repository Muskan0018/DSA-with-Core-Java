package JavaStreams.IntermediateOperations.PracticeProject;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookStoreChallenge {
    public static void main(String[] args) {

        /*
        - Discounted Books: The bookstore is planning a sale.
                Identify all books that are priced over $30. Display these books.
        - Classics Collection: The bookstore is launching a classic collection.
                Identify and display books that were published before the year 2000.
        - Upcoming Titles: Generate a list of future book titles for the next year
                          by adding the suffix "(Coming Soon)" to all the current titles.
        - Sort by Price: The bookstore wants to print price tags for all the books.
                Display the books sorted by their prices in ascending order.
        - Rare Books: The bookstore believes there might be rare books in the collection.
                   A rare book is one where the title has more than 20 characters.
                   Identify and display these books.
         */

        List<Books> books = Arrays.asList(
                new Books("The Midnight Library", 22.99, 1998, "Fiction"),
                new Books("The Lost Kingdom", 18.50, 2021, "Fantasy"),
                new Books("Murder on Maple Street", 54.99, 2019, "Mystery"),
                new Books("The World of Quantum", 24.00, 2023, "Science"),
                new Books("Forever Yours", 11.50, 2018, "Romance"),
                new Books("The Final Witness", 76.99, 2022, "Thriller"),
                new Books("Rise of the Ancient Kings", 20.00, 2017, "History"),
                new Books("Escape from the Jungle", 45.75, 1990, "Adventure"),
                new Books("Whispers in the Dark", 33.99, 1999, "Horror"),
                new Books("A Life Beyond Limits", 22.50, 2016, "Biography"),
                new Books("The Lost Kingdom", 18.50, 2021, "Fantasy"),
                new Books("Murder on Maple Street", 54.99, 2019, "Mystery"),
                new Books("The Midnight Library", 22.99, 1998, "Fiction"),
                new Books("Journey Through Space", 19.99, 2022, "Science"),
                new Books("Forever Yours", 11.50, 2018, "Romance")
        );

        System.out.println("All Books");
        books.forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        - Discounted Books: The bookstore is planning a sale.
//        Identify all books that are priced over $20. Display these books.
        System.out.println("Identify all books that are priced over $20");
        books.stream()
                .filter(book -> book.price < 20)
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        - Classics Collection: The bookstore is launching a classic collection.
//                Identify and display books that were published before the year 2000.
        System.out.println("Identify and display books that were published before the year 2000");
        books.stream()
                .filter(book -> book.publicationYear < 2000)
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        - Upcoming Titles: Generate a list of future book titles for the next year
//        by adding the suffix "(Coming Soon)" to all the current titles.
        System.out.println("Adding the suffix '(Coming Soon)' to all the current titles");
        books.stream()
                .map(book -> book.title + "  (COMING SOON)")
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        - Sort by Price: The bookstore wants to print price tags for all the books.
//                Display the books sorted by their prices in ascending order.
        System.out.println("Display the books sorted by their prices in ascending order");
        books.stream()
                .sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        - Rare Books: The bookstore believes there might be rare books in the collection.
//                A rare book is one where the title has more than 20 characters.
//                Identify and display these books.
        System.out.println("A rare book is one where the title has more than 20 characters.");
        books.stream()
                .filter(book -> book.title.length() > 20)
                .forEach(System.out::println);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}

package JavaStreams.IntermediateOperations;

import java.util.Objects;

public class Book {

    String title;
    Double price;
    int publicationYear;
    String category;

    public Book(String title, Double price, int publicationYear, String category) {
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;
        return Objects.equals(title, book.title)
                && Objects.equals(price, book.price)
                && publicationYear == book.publicationYear
                && Objects.equals(category, book.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, publicationYear, category);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", category='" + category + '\'' +
                '}';
    }

}

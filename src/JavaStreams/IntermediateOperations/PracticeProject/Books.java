package JavaStreams.IntermediateOperations.PracticeProject;

public class Books {
    String title;
    Double price;
    int publicationYear;
    String category;

    public Books(String title, Double price, int publicationYear, String category) {
        this.title = title;
        this.price = price;
        this.publicationYear = publicationYear;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                ", category='" + category + '\'' +
                '}';
    }


}

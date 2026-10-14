package PracticeProjects.ExceptionHandlingProject;

// Practice Project- 2 (Exception Handling)
  // Library Management

class Library{
    int availableBooks = 3;

    public void borrowBooks(int booksRequestedCount) throws Exception {
        if (booksRequestedCount > availableBooks)
            throw new ArrayIndexOutOfBoundsException("Not enough books available");

        if (booksRequestedCount < 0)
            throw new Exception("You must request atleast one book");
    }

}

public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();
        try {
            library.borrowBooks(5);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Exception Occured: " + e.getMessage());
        }
    }
}


// --------------------- throw ----------------------------
//public void borrowBooks(int booksRequestedCount) {
//    try{
//        if (booksRequestedCount > availableBooks)
//            throw new Exception("Not enough books available");
//    } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Exception Occured, you requested a book that does not exist!");
//    } catch (Exception e) {
//        System.out.println("Exception!!");
//    } finally {
//        System.out.println("FINALLY BLOCK");
//    }
//}


// ----------------------- try-catch -----------------------
//public void borrowBooks(int booksRequested) {
//    try{
//        int[] books = {101, 102, 103, };
//        System.out.println("Book Requested: " + books[booksRequested]);
//    } catch (ArrayIndexOutOfBoundsException e) {
//        System.out.println("Exception Occured, you requested a book that does not exist!");
//    } catch (NullPointerException e) {
//        System.out.println("Null Pointer Exception");
//    } finally {
//        System.out.println("FINALLY BLOCK");
//    }
//}

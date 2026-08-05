package PracticeQuestions;

public class PracticeOne {

// Print numbers from n to 1
   static void printNos(int n) {
        // code here
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNos(n - 1);
    }


    public static void main(String[] args) {

        printNos(10);
    }
}

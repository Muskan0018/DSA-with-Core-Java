package PracticeQuestions;

public class PrintLastDigit {
    static void main() {
        int n = 18;
        int i = n%10;
        if (i<0) {
            System.out.println(-i);
        } else
            System.out.println(i);
    }
}
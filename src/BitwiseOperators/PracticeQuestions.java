package BitwiseOperators;

public class PracticeQuestions {
    static void main() {

    // Odd-Even
        int n = 1;
        if ((n & 1) == 0) {
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }

        System.out.println("-------------------------------------------");

    // Multiply by 2
        int m = 2;
        for (int i = 1; i <= 10; i++) {
            m = m << 1;
            System.out.println("Multiply by 2: " + m);
        }

        System.out.println("-------------------------------------------");

    // Divide by 2
        for (int i = 1; i <= 10; i++) {
            m = m << 1;
            System.out.println("Divide by 2: " + m);
        }

        System.out.println("-------------------------------------------");

    // Check Power of 2
        int x = 16;

    }
}

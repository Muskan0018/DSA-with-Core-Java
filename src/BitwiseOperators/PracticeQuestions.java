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
        int x = 100;
        for (int i = 1; i <= 10; i++) {
            x = x >> 1;
            System.out.println("Divide by 2: " + x);
        }

        System.out.println("-------------------------------------------");

    // Check Power of 2
        // Basic Way
        int a = 7;
        int count = 0;

        while (a != 0) {
            if ((a & 1) != 0) {
                // ek set-bit mil gyi
                count++;
            }
            // right-shift to remove this bit
            a = a >> 1;
        }
        System.out.println("Set Bit count: " + count);

        // Advance Way by using Formula- { (n & (n - 1)) == 0 }

    }
}

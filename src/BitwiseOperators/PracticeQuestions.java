package BitwiseOperators;

public class PracticeQuestions {
    static void main() {

    // Odd-Even
        int num = 1;
        if ((num & 1) == 0) {
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
        // Basic Way [ Count the Set Bit ]
        int a2 = 7;
        int count = 0;

        while (a2 != 0) {
            if ((a2 & 1) != 0) {
                // ek set-bit mil gyi
                count++;
            }
            // right-shift to remove this bit
            a2 = a2 >> 1;
        }
        System.out.println("Set Bit count: " + count);

// Advance Way by using Formula- { (n & (n - 1)) == 0 }
        int a1 = 16;
        if((a1&(a1-1)) == 0) {
            System.out.println("Number is Power of 2!!");
        }else {
            System.out.println("Number is not a Power of 2!!");
        }

        System.out.println("-------------------------------------------");

     // Swap two numbers without 3rd Variable (By using Bitwise XOR)

      /*  Bitwise XOR (^) - It returns 1 when the two bits are different.
                          Same Bits - 0
                          Different Bits - 1
       */

        int a = 5;
        int b = 6;

        System.out.println("Before Swapping the value of a: " + a + " and b: " + b);

        a = a ^ b;    // 5^6 = 3 (0101 ^ 0110 = 0011) means 0011 = 3; now a = 3
        b = a ^ b;   // 3^6 = 5 (0011 ^ 0110 = 0101) means 0101 = 5; now b = 5
        a = a ^ b;  // 3^5 = 6 (0011 ^ 0101 = 0110) means 0110 = 6; now a = 6

        System.out.println("After Swapping the value of a: " + a + " and b: " + b);

        System.out.println("-------------------------------------------");

    // Find Unique element (all others appear twice)

        int[] arr = {45, 17, 7, 18, 17, 45, 7};
        int unique = 0;

        for (int nums : arr) {
            unique = unique ^ nums;
        }
        System.out.println("Unique Number: " + unique);

        System.out.println("-------------------------------------------");

    // Remove Last Set Bit
        int p = 10;
        System.out.println("After removing last bit: " + (p & (p -1)));

        System.out.println("-------------------------------------------");

    // Get Last Set Bit
        int n = 10;
        System.out.println("Last Set Bit: " + (n & (-n)));

        System.out.println("-------------------------------------------");

    // Count the Set Bit
        int set = 7;
        int bitCount = 0;
        while (set != 0) {
            if((set & 1) != 0) {
                bitCount++;
            }
            set = set >> 1;
        }
        System.out.println("Set Bit Count: " + bitCount);

        System.out.println("-------------------------------------------");
    }
}

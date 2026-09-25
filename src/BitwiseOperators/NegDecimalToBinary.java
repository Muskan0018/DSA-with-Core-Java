package BitwiseOperators;

import java.util.Scanner;


public class NegDecimalToBinary {
    public static void main(String[] args) {

            int n;
            System.out.print("Enter the decimal: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            String ans = "";

            // Process exactly 32 bits
            for (int i = 0; i < 32; i++) {

                int bit = n & 1;       // find the current bit

                ans = bit + ans;   // Add bit at the beginning

                n = n >>> 1;           // unsigned right shift
            }

            System.out.println("Answer: " + ans);

            sc.close();
    }
}

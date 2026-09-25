package BitwiseOperators;

import java.util.Scanner;


public class NegDecimalToBinary {
    public static void main(String[] args) {

            int n;
            System.out.print("Enter the decimal: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            long ans = 0;
            long place = 1;

            // Process exactly 32 bits
            for (int i = 0; i < 32; i++) {

                int bit = n & 1;       // find the current bit
                ans = ans + bit * place;

                n = n >>> 1;           // unsigned right shift
                place = place * 10;
            }

            System.out.println("Answer: " + ans);

            sc.close();
    }
}

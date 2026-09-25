package BitwiseOperators;

import java.util.Scanner;

import static java.lang.Math.pow;

/* for reverse(binary): ans = 0;
                        bit = n & 1; 
                        ans = (bit * pow(10, i)) + ans;
*/

/* for reverse(decimal): ans = 0;
                         digit = n % 10;
                         ans = (ans * 10) + digit;
*/

public class DecimalToBinary {
    public static void main(String[] args) {

        int n;
        System.out.print("Enter the decimal: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int ans = 0;
        int i = 0;

        while (n != 0) {
            int bit = n & 1;   // for finding the bit
            ans = (int)(bit * Math.pow(10, i)) + ans;   // reverse the ans

            n = n >> 1;   // right shift (for finding the 2nd bit)
            i++;
        }
        System.out.println("Answer: " + ans);

    }
}

package BitwiseOperators;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary: ");
        int n = sc.nextInt();

        int ans = 0;
        int i = 0;

        while (n != 0) {
            int digit = n % 2;
            if(digit == 1) {
                ans = ans + digit * (int)Math.pow(2, i);
            }
            n = n / 10;
            i++ ;
        }
        System.out.println("Ans: " + ans);
    }
}

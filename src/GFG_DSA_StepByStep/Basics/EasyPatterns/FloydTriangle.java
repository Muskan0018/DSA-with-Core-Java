package GFG_DSA_StepByStep.Basics.EasyPatterns;

//Given a number n, print Floyd's triangle with n lines.
//Floyd’s Triangle is a pattern of consecutive natural numbers arranged in rows, where the i-th row contains i numbers.

//Input: n = 4
//Output:
//1
//2 3
//4 5 6
//7 8 9 10

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
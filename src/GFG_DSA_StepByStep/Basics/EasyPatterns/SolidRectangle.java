package GFG_DSA_StepByStep.Basics.EasyPatterns;

import java.util.Scanner;

public class SolidRectangle {
    static void solidRec(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();

        solidRec(n, m);
    }
}

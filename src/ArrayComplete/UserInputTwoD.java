package ArrayComplete;

import java.util.Scanner;

public class UserInputTwoD {
    static void main() {

        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        // for User Input
//        System.out.println("Enter the elements of Matrix: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Provide value for row: " + i + "and column: " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        // For Printing Matrix
        System.out.println("Matrix is: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}

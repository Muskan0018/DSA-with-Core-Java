package PracticeQuestions.Arrays;

import java.util.Scanner;

public class TakingUserInput {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

// For taking elements from user
        int[] arr = new int[n];
        System.out.println("Enter the elements of an Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

// For printing the Array
//        System.out.println("Array elements are: ");
//        for (int val : arr) {
//            System.out.print(val + " ");
//
//            sc.close();
//        }

        //or for printing
        System.out.println("Array elements are" );
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

package ArrayComplete;

import java.util.Scanner;

public class Arrays {
    static void main() {

        Scanner sc = new Scanner(System.in);

    // taking input of index
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

    // Input Element Values
//        System.out.println("Enter array elements:");

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter array element " + i + ": ");
            arr[i] = sc.nextInt();
        }

    // Print
        System.out.print("Array elements are: ");

        for (int i : arr) {
            System.out.print(i + " ");
        }

//        int arr[];           // Declaration
//        arr = new int[5];    // Allocation
//        int brr[] = {1,2,3,4,5};  // initialization

        // Accessing the Element
//        System.out.println("Value at index 2: " + brr[2]);

//        int n = brr.length;
//        System.out.println("Length of brr: " + n);
//
//        for (int index = 0; index <= n - 1; index++){
//            System.out.println(brr[index]);
//        }

        // For Each Loop
//        for (int val : brr){
//            System.out.print(val + " ");
//        }

    }
}

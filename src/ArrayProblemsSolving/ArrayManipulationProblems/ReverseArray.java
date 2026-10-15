package ArrayProblemsSolving.ArrayManipulationProblems;

// Reverse an Array

/* Problem Statement:- Given an array of integers, reverse the order of its elements in place.
                      The first element should become the last, the second element should
                      become the second-to-last, and so on.

Example:

Input: arr = [2, 4, 6, 8, 9]

Output: [9, 8, 6, 4, 2]
*/

public class ReverseArray {

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: ");
        for (int k: arr) {
            System.out.print(k + " ");
        }
    }

    static void main() {
        int[] arr = {2, 4, 6, 8, 9};
        reverseArray(arr);
    }
}

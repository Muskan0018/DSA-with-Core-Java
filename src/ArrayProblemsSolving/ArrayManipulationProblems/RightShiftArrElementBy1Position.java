package ArrayProblemsSolving.ArrayManipulationProblems;

import java.util.Arrays;

//------------------ RIGHT SHIFT ARRAY ELEMENTS BY 1 POSITION TO THE RIGHT --------------------------------

/* Problem Statement: Given an array of N integers, rotate the array to the right by one position.
                      The last element of the array should be moved to the first position, and all
                      remaining elements should shift one position to the right.
Example:-

Input: arr = {10, 20, 30, 40, 50, 60, 70}
Output: {70, 10, 20, 30, 40, 50, 60}

Time Complexity: O(n)   because we shift each element at most once.
Space Complexity: O(1)  because we use only one extra variable to store the last element.
*/


public class RightShiftArrElementBy1Position {

    static void shiftBy1(int[] arr) {
        //step 1: Store last element in temp
        int n = arr.length;
        int temp = arr[n - 1] ;

        //step 2: Shift elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        //step 3: Place the last element at the first position
        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        shiftBy1(arr);

        System.out.println("Output: " + Arrays.toString(arr) + " ");

//        System.out.println("After Shifting Array Elements by 1 Position: ");
//        for (int k : arr) {
//            System.out.print(k + " ");
//        }
    }
}

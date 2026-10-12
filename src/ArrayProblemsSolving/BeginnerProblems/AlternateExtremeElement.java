package ArrayProblemsSolving.BeginnerProblems;

import java.util.*;


/*  Problem Statement: Print Alternate Extreme Elements

   Given a sorted array of integers, print its elements alternately from
   the two extremes: first the smallest element, then the largest, then
   the second smallest, then the second largest, and so on.

Example:

Input: arr = [1, 2, 3, 4, 5, 6, 7]
Output: 1 7 2 6 3 5 4

*/

public class AlternateExtremeElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            System.out.print(arr[left] + " ");
            left++;

            if (left <= right) {
                System.out.print(arr[right] + " ");
                right--;
            }
        }
    }
}

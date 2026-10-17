package ArrayProblemsSolving.ArrayManipulationProblems;

//---------------------- PRINT EXTREME ELEMENTS IN AN ALTERNATE MANNER --------------------------

/*  Problem Statement: Print Alternate Extreme Elements

   Given a sorted array of integers, print its elements alternately from
   the two extremes: first the smallest element, then the largest, then
   the second smallest, then the second largest, and so on.

Example:

Input: arr = [1, 2, 3, 4, 5, 6, 7]
Output: 1 7 2 6 3 5 4

*/

// USING TWO POINTER


public class ExtremeEleInAnAlternateManner {

    static void printExtremeElement(int[] arr) {
        int n = arr.length;
        // 1st pointer
        int i = 0;        // i is set to index 0.

        // 2nd pointer
        int j = n - 1;   // j is set to last index (n-1)

        while (i <= j) {
            if(i == j) {
                System.out.print(arr[i] + " ");
                return ;
            }
            else {
                // (i < j)
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
       printExtremeElement(arr);
    }
}


// ------------- METHOD 2 ------------

//public class AlternateExtremeElement {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            System.out.print(arr[left] + " ");
//            left++;
//
//            if (left <= right) {
//                System.out.print(arr[right] + " ");
//                right--;
//            }
//        }
//    }
//}

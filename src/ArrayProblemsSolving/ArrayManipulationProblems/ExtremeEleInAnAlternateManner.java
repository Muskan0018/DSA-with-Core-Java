package ArrayProblemsSolving.ArrayManipulationProblems;

//---------------------- PRINT EXTREME ELEMENTS IN AN ALTERNATE MANNER --------------------------

import java.util.Arrays;

public class ExtremeEleInAnAlternateManner {

    static void printExtremeElement(int[] arr) {
        int n = arr.length;
        int i = 0;        // i is set to index 0.
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

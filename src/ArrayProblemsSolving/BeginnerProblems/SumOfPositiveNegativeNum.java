package ArrayProblemsSolving.BeginnerProblems;

//  Problem: Sum of Positive and Negative Numbers in an Array

/* Given an integer array arr, calculate the sum of all positive numbers and the sum of all negative numbers separately.
    Return both sums in a new integer array, where:
       * ans[0] stores the sum of positive numbers.
       * ans[1] stores the sum of negative numbers.
Example:

Input: arr = {1, -2, 2, 3, -4, -3, 4, -1};

Output: Sum of Positive Numbers: 10
        Sum Of Negative Number: -10
*/

public class SumOfPositiveNegativeNum {

    static int[] getPositiveNegativeSum(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                positiveSum += arr[i];
            }else {
                negativeSum += arr[i];
            }
        }
        int[] ans = {positiveSum, negativeSum};

        return ans;
    }

    static void main() {
        int[] arr = {1, -2, 2, 3, -4, -3, 4, -1};
        int[] ans = getPositiveNegativeSum(arr);
        System.out.println("Sum of Positive Numbers: " + ans[0] +  "\nSum Of Negative Number: " + ans[1]);
    }
}

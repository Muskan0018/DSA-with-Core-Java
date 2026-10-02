package ArrayProblemsSolving.BeginnerProblems;

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

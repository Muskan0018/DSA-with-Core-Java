package ArrayProblemsSolving.BeginnerProblems;

// Count the Number of Zeroes and Ones in an array

public class CountZerosAndOnes {
    static int[] countZeroesAndOnes(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount ++;
            } else if (arr[i] == 1){
                oneCount ++;
            }
            else {
                throw new IllegalArgumentException(
                  "Array must contai only 0 & 1"
                );
            }
        }
        int[] ans = {zeroCount, oneCount};
        return ans;
    }

    static void main() {
        int[] arr = {1, 0, 0, 1, 1, 1, 0, 1, 0};
        int[] ans = countZeroesAndOnes(arr);
        System.out.println("Zero Count: " + ans[0] + "\nOne Count: " + ans[1]);
    }
}

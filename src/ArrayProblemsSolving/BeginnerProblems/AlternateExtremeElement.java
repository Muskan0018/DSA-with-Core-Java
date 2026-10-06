package ArrayProblemsSolving.BeginnerProblems;

public class AlternateExtremeElement {
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        int k = 0;
        int j = arr.length;

        for (int i=0; k <= j; i++){
            if (arr[k] <= arr[j]) {
                System.out.println(arr[i]);
                k++;
                j--;
            }
        }
    }
}

package ArrayProblemsSolving.BeginnerProblems;

public class AvgOfArrElements {
    static double getAverage(int[] arr){
        double sum = 0;
        int arrSize = arr.length;
        for (int num : arr) {
            sum = sum + num;
        }
        double avg = sum / arrSize;
        return avg;
    }
    static void main() {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Average: " + getAverage(arr));

    }
}

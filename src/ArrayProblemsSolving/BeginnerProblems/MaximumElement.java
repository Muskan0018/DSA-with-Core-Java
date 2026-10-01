package ArrayProblemsSolving.BeginnerProblems;

// Find the Maximum Element in an Array

public class MaximumElement {
    static int maximumElementInArray(int[] arr)
    {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static void main() {
        int[] arr = {1,12, 15, 18, 0};
        System.out.println("Maximum Value is: " + maximumElementInArray(arr));
    }
}

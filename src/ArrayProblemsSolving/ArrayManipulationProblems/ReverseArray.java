package ArrayProblemsSolving.ArrayManipulationProblems;

public class ReverseArray {

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while(start <= end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array: ");
        for (int k: arr) {
            System.out.print(k + " ");
        }
    }

    static void main() {
        int[] arr = {2, 4, 6, 8, 9};
        reverseArray(arr);
//        System.out.println("Reversed Array: " + reverseArray(arr););
    }
}

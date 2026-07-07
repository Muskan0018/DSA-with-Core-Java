package ArrayComplete;

public class PracticeArr {
    static void main(String[] args) {

// Problem 1: Sum of all Elements
//        int arr[] = {10,20,20,22,28};
//        int sum = 0;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.print("Sum: " + sum);

// Problem 2: Multiplication of all Elements
//        int arr[] = {1,2,3,4,5};
//        int mul = 1;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++){
//            mul *= arr[i];
//        }
//        System.out.print("Multiplication of the Elements is: " + mul);

// Problem 3: Find Maximum Element inside the Array
//        int arr[] = {8,7,18,9,4,5,6,1,2,3};
//        int len = arr.length;
//        int maxValue = arr[0];

        // Compare each value of array with maxValue
//        for (int i=0; i < len; i++){
//            if (arr[i] > maxValue){
//                // update maxValue
//                maxValue = arr[i];
//            }
//        }
//        System.out.println("Maximum Value is: " + maxValue);

// Problem 4: Find the Minimum Element inside the Array
//        int arr[] = {10,2,1,5,6,7,-1,-20};
//        int len = arr.length;
//        int minVal = arr[0];
//        // Compare each value of array with minValue
//        for (int i = 0; i < len; i++) {
//            if (arr[i] < minVal) {
//                minVal = arr[i];
//            }
//        }
//        System.out.println("Minimum Value is: " + minVal);

// Problem 5: Reverse Array (Two Pointer)
        int arr[] = {1,2,3,4,5};
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

package ArrayComplete;

public class TwoDPracticeArr {
    static void main() {

// Problem 1: Sum of all Elements
        int arr[][] = {
                         {1,2},
                         {3,4},
                         {5,6}
                       };
        int sum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        System.out.println("Sum: " + sum);

// Problem 1: Multiplication of all Elements
//        int arr[][] = {
//                {1,2},
//                {3,4},
//                {5,6}
//        };
//        int mul = 1;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                mul *= arr[row][col];
//            }
//        }
//        System.out.println("Multiplication: " + mul);

// Problem 3: Find Maximum Element inside the Matrix
//        int arr[][] = {
//                {1,2,3},
//                {21,20,19}
//        };
//         int maxVal = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] > maxVal){
//                    maxVal = arr[row][col];
//                }
//            }
//        }
//        System.out.println("Maximum Value is: " + maxVal);

// Problem 4: Find the Minimum Element inside the Matrix
//        int arr[][] = {
//                {1,2,3},
//                {21,20,19}
//        };
//        int minVal = arr[0][0];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] < minVal){
//                    minVal = arr[row][col];
//                }
//            }
//        }
//        System.out.println("Minimum Value is: " + minVal);
    }
}

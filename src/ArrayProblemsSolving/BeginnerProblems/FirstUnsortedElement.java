package ArrayProblemsSolving.BeginnerProblems;

// Find First Unsorted Element in Array

public class FirstUnsortedElement {

    static int unsortedElement(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){    // When i reaches the last index, arr[i + 1] will cause ArrayIndexOutOfBoundsException.
                                                    // // that's why we do this- for(int i = 0; i < arr.length - 1; i++)

            if(arr[i+1] <= arr[i]){         // <= ki jagah < bhi kiya hai, kyunki equal elements hone se increasing order break nahi hota. For example, [1, 2, 2, 4] non-decreasing sorted array hai.
                return arr[i+1];
            }
        }
        // jis case me main loop se bahar aajunga to
        // If the entire array is sorted, return -1.
        return -1;
    }

    static void main() {
        int[] arr = {1, 2, 5, 4, 9};
        System.out.println("Unsorted Element: " + unsortedElement(arr));
    }
}

package ArrayProblemsSolving.BeginnerProblems;

// =================================== LINEAR SEARCH =============================== \\

// Problem:  Searching for an element in the array (Linear Search)

/*  Given an integer array and a target value, find the index of the target value using Linear Search. If the target is not present, return -1.

Example:
arr = {10, 20, 30, 40, 50}
target = 30

Search process: 10 → 20 → 30 ✓

So the answer is: Index = 2
*/
public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        int size = arr.length;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        // agar poora array travel ho chuka h
        //and ek bhi target nhi mila
        // iska mtlb, target is not present in array
        //return false or -1
        return -1;
    }

    static void main() {
        int[] arr = {10, 12, 14, 16, 18, 20};
        int target = 18;
//        int result = searchElement(arr, target)
        System.out.println("Search Element at Index: " + linearSearch(arr, target));
    }
}

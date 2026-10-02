package LeetCodeProblems.ArraysProblem;

// ====================== SEARCH INSERT POSITION ======================

/*  Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You must write an algorithm with O(log n) runtime complexity.

 Example 1:
   Input: nums = [1,3,5,6], target = 5
   Output: 2

Example 2:
  Input: nums = [1,3,5,6], target = 2  }  Our target is 2. Now compare: 2 > 1 → Yes and 2 < 3 → Yes
  Output: 1                            }  This means 2 should be inserted between 1 and 3.

Example 3:
  Input: nums = [1,3,5,6], target = 7
  Output: 4

 */

public class SearchInsertPosition {

    static int searchInsertPosition(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                return i;
            }
        }
        return arr.length;
    }

    static void main() {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        System.out.println("Search Insert Position: " + searchInsertPosition(arr, target));
    }

}

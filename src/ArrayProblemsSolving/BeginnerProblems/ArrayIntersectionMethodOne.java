package ArrayProblemsSolving.BeginnerProblems;

import java.util.ArrayList;

/*  Problem: Intersection of Two Arrays

Given two integer arrays, return their intersection — the elements that
appear in both arrays. Usually, each element should appear only once.

Example:

Input: nums1 = [1, 2, 2, 1]
       nums2 = [2, 2, 3]

Output: [2]

 */

public class ArrayIntersectionMethodOne {
    static void main(String[] args) {
        int[] arr1 = {1,2,2,3};
        int[] arr2 = {2,2,1};
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0; i<arr1.length; i++){
            for (int j=0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] ){
                    if (!ans.contains(arr1[i])) {
                        ans.add(arr1[i]);
                    }
                }
            }
        }
        System.out.println("Array Intersection: " + ans);

    }
}

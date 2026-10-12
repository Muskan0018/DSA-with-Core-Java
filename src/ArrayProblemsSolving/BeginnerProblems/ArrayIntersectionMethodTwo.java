package ArrayProblemsSolving.BeginnerProblems;

import java.util.*;

/*  Problem: Intersection of Two Arrays

Given two integer arrays, return their intersection — the elements that
appear in both arrays. Usually, each element should appear only once.

Example:

Input: nums1 = [1, 2, 2, 1]
       nums2 = [2, 2, 3]

Output: [2]

 */

public class ArrayIntersectionMethodTwo {
        public int[] intersection(int[] nums1, int[] nums2) {

            // Store unique elements of nums1
            Set<Integer> set1 = new HashSet<>();

            for (int num : nums1) {
                set1.add(num);
            }

            // Store common elements
            Set<Integer> result = new HashSet<>();

            for (int num : nums2) {
                if (set1.contains(num)) {
                    result.add(num);
                }
            }

            // Convert Set into an array
            int[] ans = new int[result.size()];
            int i = 0;

            for (int num : result) {
                ans[i++] = num;
            }

            return ans;
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2, 2, 1};
            int[] nums2 = {2, 2, 3};

            ArrayIntersectionMethodTwo obj = new ArrayIntersectionMethodTwo();

            int[] ans = obj.intersection(nums1, nums2);

            System.out.println("Intersection Array: " + Arrays.toString(ans));
        }
}

package ArrayProblemsSolving.BeginnerProblems;

import java.util.ArrayList;

public class ArrayIntersection {
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

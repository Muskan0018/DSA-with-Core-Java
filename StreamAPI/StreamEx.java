package StreamAPI;
// Stream API - Using Stream API, rewrite the following code to calculate the sum of double the even numbers from a list.


import java.util.*;
public class StreamEx {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 8, 9, 4, 5, 6);

        // for(int i = 0; i < nums.size(); i++)
        // {
        //     System.out.print(nums.get(i) + " ");
        // }

        // for(int n : nums)
        // {
        //     System.out.print(n + " ");
        // }

        nums.forEach(n -> System.out.print(n + " "));

        // int sum = 0;

        // for(int n : nums)
        // {
        //     if(n%2==0)
        //     {
        //         n = n * 2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);
    }
}

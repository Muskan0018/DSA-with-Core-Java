package GFG_DSA_StepByStep.Basics.EasyMaths;
import java.util.*;

public class SumOfNaturalNum {

    // Method 1
    static int sumOfNatural(int n) {
        int sum = 0;
        if (n == 0) {
            System.out.println(sum);
        }else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }

    // Method 2
    static int sumOfNat(int n) {
        return n*(n+1) / 2;
    }

    public static void main(String[] args) {
//        sumOfNatural(6);

        System.out.println("Sum of Natural Number: " + sumOfNatural(7));

        System.out.println("Sum of Natural Number: " + sumOfNat(6));
    }
}

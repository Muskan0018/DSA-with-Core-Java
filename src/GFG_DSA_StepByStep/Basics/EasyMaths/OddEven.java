package GFG_DSA_StepByStep.Basics.EasyMaths;

//Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

public class OddEven {

    static boolean isOddOrEven(int n) {
        if (n % 2 == 0){
            return true;
        }
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isOddOrEven(18));
    }
}

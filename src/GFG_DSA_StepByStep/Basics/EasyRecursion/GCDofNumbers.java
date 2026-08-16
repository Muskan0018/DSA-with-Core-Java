package GFG_DSA_StepByStep.Basics.EasyRecursion;

public class GCDofNumbers {

    static int getGCD(int a, int b) {
        while (b != 0) {
            int oldVal = b;
            b = a % oldVal;
            a = oldVal;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.print("GCD of given two numbers is: " + getGCD(20, 28));
    }
}

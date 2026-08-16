package GFG_DSA_StepByStep.Basics.EasyRecursion;

//Given an positive integer n, print numbers from 1 to n without using loops.

public class WithoutLoop {

    static void printWithoutLoop(int n) {
        if (n == 0) {
            return;
        }
        printWithoutLoop(n - 1);
        System.out.print(n  + " ");
    }

    public static void main(String[] args) {
        printWithoutLoop(5);
    }
}

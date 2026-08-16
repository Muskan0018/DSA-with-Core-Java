package GFG_DSA_StepByStep.Basics.EasyRecursion;

//Print numbers from n to 1 (space separated) without the help of loops.

public class PrintNto1 {
    static void pritnN(int n){
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        pritnN(n - 1);
    }

    public static void main(String[] args) {
        pritnN(10);
    }
}

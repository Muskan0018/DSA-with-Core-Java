package GFG_DSA_StepByStep.Basics.MediumPatterns;

public class PyramidPattern {

    static void printPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++){ // for spaces
            System.out.print("  ");
            }
            for(int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}

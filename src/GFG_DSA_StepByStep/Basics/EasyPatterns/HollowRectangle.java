package GFG_DSA_StepByStep.Basics.EasyPatterns;

public class HollowRectangle {
    static void hollowRec(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                }
                else if (j == 1 || j == m) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRec(4, 3);
    }
}

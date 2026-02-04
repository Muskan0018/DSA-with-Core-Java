public class PatternFour {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                // System.out.print("* ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
 
/*    TRIANGLE NUMBER PATTERN
     * 1 
     * 2 2 
     * 3 3 3 
     * 4 4 4 4 
     * 5 5 5 5 5 
*/
public class PatternEight {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            //space for right side
            for(int j=0; j < i; j++){
                System.out.print(" ");
            }
            // Star
            for(int j=0; j < 2*n-(2*i + 1); j++){
                System.out.print("*");
            }
            //  Space for left side
            for(int j=0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*   INVERTED PYRAMID STAR PATTERN
     * *********    [0 space + 9 stars + 0 space]
     *  *******     [1 space + 7 stars + 1 space]
     *   *****      [2 spaces + 5 stars + 2 spaces]
     *    ***       [3 spaces + 3 stars + 3 spaces]
     *     *        [4 spaces + 1 star + 4 spaces]
     * 
     * for example if; total no. of rows = n
     *  no. fo rows (i) = 5
     * no of columns (j) = 9
     * SPACE = i (if i=0, space=0; if i=1, space=1; if i=2, space=2; if i=3, space=3; if i=4, space=4)
     * STAR = 2*n-(2*i+1) (if i=0, star=9; if i=1, star=7; if i=2, star=5; if i=3, star=3; if i=4, star=1)
     * SPACE = n-i-1 (if i=0, space=4; if i=1, space=3; if i=2, space=2; if i=3, space=1; if i=4, space=0)
 */

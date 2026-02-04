public class PatternSix {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*   INVERTED TRIANGLE NUMBER PATTERN
     * 1 2 3 4 5 
     * 1 2 3 4 
     * 1 2 3 
     * 1 2 
     * 1 
     * 
     * j = 1 to n-i+1  -> for columns
     * i = 1 to n      -> for rows
 */

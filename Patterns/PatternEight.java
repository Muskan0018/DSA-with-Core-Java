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

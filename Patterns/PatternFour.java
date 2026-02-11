public class PatternFour {

    static void pattern16(int n){
        for(int i = 0; i < n; i++){
         // Define the character for each row based on row index
            char ch = (char) ('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
   
    static void pattern17(int n){
        for(int i = 0; i < n; i++){
            // space
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            // character
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2; // Calculate the breakpoint for character change

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakpoint) ch++;
                else ch--;
            }

            // Print trailing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void pattern18(int n){
        for(int i = 0; i < n; i++){
            for(char ch = (char) ('E' - i); ch <= 'E' ; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;

        // System.out.println("--------------------------------------------------------");
        // pattern16(n);
        // System.out.println("--------------------------------------------------------");
        // pattern17(n);
        // System.out.println("--------------------------------------------------------");
        pattern18(n);
        System.out.println("--------------------------------------------------------");
    }
}

public class PatternFour {

    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            // Define the character for each row based on row index
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // character
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2; // Calculate the breakpoint for character change

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);

                // Increment or decrement character
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // Print trailing spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern19(int n) {

        int initial_spaces = 0;

        // for Upper Half
        for (int i = 0; i < n; i++) {

            // Stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < initial_spaces; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            initial_spaces += 2; // Increment spaces for the next row
            System.out.println();
        }
        // Lower Half

        initial_spaces = 8;
        for (int i = 1; i <= n; i++) {

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < initial_spaces; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initial_spaces -= 2; // Decrement spaces for the next row
            System.out.println();
        }

    }

    static void pattern20(int n) {

        int spaces = 2 * n - 2; // Initial spaces for the first row

        // Outer loop for number of rows.
        for (int i = 1; i <= 2 * n - 1; i++) {

            // stars would be equal to the row no. uptill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if (i > n)
                stars = 2 * n - i;

            // for printing the stars in each row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();

            if (i < n)
                spaces -= 2;
            else
                spaces += 2;
        }
    }

    static void pattern21(int n) {

        // Outer loop for rows
        for (int i = 0; i < n; i++) {
            // Inner loop for columns
            for (int j = 0; j < n; j++) {
                // Print star if it's a border cell
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    System.out.print("*");
                // Print space otherwise
                else
                    System.out.print(" ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }

    static void pattern22(int n){

        // Outer loop for rows
        for (int i = 0; i < 2 * n - 1; i++) {
            // Inner loop for columns
            for (int j = 0; j < 2 * n - 1; j++) {
                // Calculate distance from top
                int top = i;
                // Calculate distance from left
                int left = j;
                // Calculate distance from bottom
                int bottom = (2 * n - 2) - i;
                // Calculate distance from right
                int right = (2 * n - 2) - j;

                // Take the minimum of all four distances
                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                // Print number (starts with n at border, decreases inside)
                System.out.print((n - minDist) + " ");
            }
            // Move to the next row
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
        // pattern18(n);
        // System.out.println("--------------------------------------------------------");
        // pattern19(n);
        // System.out.println("--------------------------------------------------------");
        // pattern20(n);
        // System.out.println("--------------------------------------------------------");
        // pattern21(n);
        // System.out.println("--------------------------------------------------------");
        pattern22(n);
        System.out.println("--------------------------------------------------------");
    }
}

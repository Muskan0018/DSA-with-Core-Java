public class PatternTwo {

    static void pattern6(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int N) {
        for (int i = 0; i < N; i++) {
            // space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int N) {
        for (int i = 0; i < N; i++) {
            // space for right side
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Space for left side
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int N) {
        // for Upper Half
        for (int i = 0; i < N; i++) {
            // space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // for Lower Half
        for (int i = 0; i < N; i++) {
            // space for right side
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Star
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // Space for left side
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern10(int N) {

        // Outer loop for number of rows.
        for (int i = 1; i <= 2 * N - 1; i++) {

            // stars would be equal to the row no. uptill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if (i > N)
                stars = 2 * N - i;

            // for printing the stars in each row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 5;

        System.out.println("--------------------------------------------------------");
        pattern6(N);
        System.out.println("--------------------------------------------------------");
        pattern7(N);
        System.out.println("--------------------------------------------------------");
        pattern8(N);
        System.out.println("--------------------------------------------------------");
        pattern9(N);
        System.out.println("--------------------------------------------------------");
        pattern10(N);
        System.out.println("--------------------------------------------------------");
    }
}


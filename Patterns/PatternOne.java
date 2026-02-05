public class PatternOne {

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print("* ");
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print("* ");
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int n = 5;

        System.out.println("--------------------------------------------------------");
        pattern1(n);
        System.out.println("--------------------------------------------------------");
        pattern2(n);
        System.out.println("--------------------------------------------------------");
        pattern3(n);
        System.out.println("--------------------------------------------------------");
        pattern4(n);
        System.out.println("--------------------------------------------------------");
        pattern5(n);
        System.out.println("--------------------------------------------------------");

    }
}

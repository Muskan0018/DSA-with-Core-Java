import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        // Scanner sc  = new Scanner(System.in);
        // System.out.println("Enter number of rows: ");
        // int n = sc.nextInt();
        // System.out.println("Enter number of columns: "); 
        // int m = sc.nextInt();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


/*    TRIANGLE PATTERN ( n/2 forest)
     * 
     * 
     * * 
     * * * 
     * * * * 
     * * * * *
     */
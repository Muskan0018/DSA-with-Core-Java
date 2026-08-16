package PracticeQuestions;

//public class MyClass {
//}
import java.util.Scanner;

class MyClass {

    // Function to calculate sum of integers
    public static int calculate_sum_of_integers(int k, int[] numbers) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read k
        int k = sc.nextInt();

        // Check if k is greater than 100
        if (k > 100) {
            System.out.println("Input Invalid");
            return;
        }

        int[] numbers = new int[k];

        // Read k integers
        for (int i = 0; i < k; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Input Invalid");
                return;
            }
            numbers[i] = sc.nextInt();
        }

        // Calculate and print sum
        int result = calculate_sum_of_integers(k, numbers);
        System.out.println(result);
    }
}
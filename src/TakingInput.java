import java.util.Scanner;

public class TakingInput {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();

        int answer = firstNum + secondNum;
        System.out.println("Answer: " + answer);

        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("My name is: " + name);

        sc.close();
    }
}

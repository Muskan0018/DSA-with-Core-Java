package BasicMaths;

public class MathsPractice {

// Problem 1: Print digits of a number
    // if Input: 53127, then Output should be : 5 3 1 2 7 (not compulsory to print in order)
    static void printDigits(int num) {
        // if num == 0, then stop
        // if num != 0, processing
        while (num != 0){
            int digit = num % 10;
            System.out.println(digit);
            // remove last digit
            num = num / 10;
        }
    }

// Problem 2: Count all digits of a Number
    // if num = 53127, then output = 5
    static int countDigits(int num ){
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

// Problem 3: Sum of digits of a number
    // if num = 53127 , then Output = 18
    static int sumOfDigits(int num ){
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }

// Reverse a Number
    // if num = 53127, then Output = 72135
    static int reversedNumber(int num) {
            int revNum = 0;
            // ans = ans * 10 + currentDigit
            while (num != 0) {
                int digit = num % 10;
                // reverse num calculate as per formula
                revNum = revNum * 10 + digit;
//                ans = ans + digit;
                // remove last digit
                num = num / 10;
            }
            return revNum;
    }

    public static void main (String [] args) {

        int num = 53127;

//        printDigits(num);

//        int ans = countDigits(num);
//        System.out.println("Answer: " + ans);

//        int sum = sumOfDigits(num);
//        System.out.println("Sum: " + sum);

        int rev = reversedNumber(num);
        System.out.println("Reversed Number: " + rev);
    }
}

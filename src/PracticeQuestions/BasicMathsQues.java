package PracticeQuestions;

public class BasicMathsQues {

// Sum of Two Numbers
    static int sumOfNumbers(int a, int b) {
        return a + b;
    }

// Subtract Two Numbers
    static int subtractNums(int a, int b) {
        return a - b;
    }

// Multiply Two Numbers
    static int multiplyNum(int a, int b) {
        return a * b;
    }

// Divide Two Numbers
    static int divideNums(int a, int b) {
        return  a / b;
    }

// Sum of Natural Numbers
//    static int sumOfNaturalNumber(int n) {
//        int sum = 0;
//        if(n == 0) {
//            return sum;
//        }else {
//            for (int i = 1; i <= n; i++) {
//                sum = sum + i;
//            }
//            return sum;
//        }
//    }
   // Method 2: Optimized Approach
    static int sumOfNaturalNumber(int n) {
        return n * (n + 1) / 2;
    }

// Sum of all prime numbers between 1 and n
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sumOfPrime(int n) {
        // code here
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

// Factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


   public static void main(String[] args) {

//       System.out.println("Sum of two nums: " + sumOfNumbers(10, 8));
//       System.out.println("Difference is: " + subtractNums(36, 18));
//       System.out.println("Multiplication is: " + multiplyNum(2, 3));
//       System.out.println("Division is: " + divideNums(12, 2));

//       System.out.println("Sum of natural numbers from 0 to n: " + sumOfNaturalNumber(10));

//       System.out.println("Sum of all prime numbers from 1 to n: " + sumOfPrime(10));

       System.out.println("Factorial is: " + factorial(5));

    }
}

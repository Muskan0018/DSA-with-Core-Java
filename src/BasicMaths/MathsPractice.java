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

// Palindrome Number
    static boolean isPalindrome(int num) {
//        if (num < 0){ return false; }  // for negative values
        int originalNum = num;
        int reverseNum = reversedNumber(num);
        if (originalNum == reverseNum) {
            System.out.println(" It is a Palindrome.");
            return true;
        }
        System.out.println(" It is not a Palindrome.");
        return false;
    }

// Prime Number
    static boolean isPrimeOrNot(int num) {
        // this one is slower (it takes O(n) time complexity)
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0) {
//                // not a prime
//                return false;
//            }
//        }

        //faster one  (it takes O(sqrt n) time complexity)
        for (int i = 2; i <= Math.sqrt(num); i++){    // or u can also write (i=2; i*i <= num; i++)
            if (num % i == 0) {
                // not a prime
                return false;
            }
        }

        // jab tak remainder zero nhi aata tab tak loop se bahar nhi aa paoge
        // aur agar kabhi remainder 0 nahi aaya
        // that means it is Prime

        return true ;
    }

// Greatest Common Divisor (GCD) or Highest Common Factor (HCF) of a Number
    // EUCLIDEAN ALGORITHM
    static int getGDC(int a, int b) {
        // gcd(a,b) = gcd(b, a%b)

        while(b != 0) {   // b jab tak zero nhi ho rha tab tak operation perform krte rho
            int oldValueOfB = b;
            b = a % oldValueOfB;
            a = oldValueOfB;
        }
        // jab b=0, tab a ki place pe GCD milega
        int ans = a;
        return ans;
    }

// LCM of a Number

    public static void main (String [] args) {

//        int num = 123;

//        printDigits(num);

//        int ans = countDigits(num);
//        System.out.println("Answer: " + ans);

//        int sum = sumOfDigits(num);
//        System.out.println("Sum: " + sum);

//        int rev = reversedNumber(num);
//        System.out.println("Reversed Number: " + rev);

//        boolean ans = isPalindrome(121);

//        System.out.println(isPrimeOrNot(num));

//        System.out.println("GCD of a and b is: " + getGDC(18, 12));

    }
}

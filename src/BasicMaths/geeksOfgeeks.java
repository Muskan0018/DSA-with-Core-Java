package BasicMaths;

public class geeksOfgeeks {

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

//Given a number x, the task is to print the numbers from x to 0 in decreasing order in a single line.
//Example:
//Input: x = 3
//Output: 3 2 1 0
//Explanation: Numbers in decreasing order from 3 are 3 2 1 0.
    // While Loop Question

    public static void utility(int x) {
        while(x>=0){
            System.out.print("No. in decreasing order: " +x+" ");
            x--;
        }
    }






        public static void main(String[] args) {
            int n = 10;
//            System.out.println(sumOfPrime(n));

            int n1 = 5;
            utility(n1);
        }

}


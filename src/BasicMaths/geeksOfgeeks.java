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
        public static void main(String[] args) {
            int n = 10;
            System.out.println(sumOfPrime(n));
        }
}


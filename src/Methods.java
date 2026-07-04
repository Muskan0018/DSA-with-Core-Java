public class Methods {

    // Method to print the Table of 2.
    // Method Declaration/Definition
    static void printTable() {         // method
        for (int i=1; i<=10; i++){
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }

    // Method with Parameters
    static void printSum (int x, int y){
        System.out.println("SUM: " + (x+y));
    }

    // Method with No Parameters
    static void printSum(){
        int a = 10;
        int b = 8;
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    // Method with Void Return Type
    static void multiply(int a, int b){
        int mul = a*b;
        System.out.println("Result: " + mul);
    }

    // Method with Non-Void Return Type
    static int add (int p, int q){
        return p + q;
    }

    static void main() {
//        System.out.println("Hi");

//        printTable();

//        System.out.println("Bye");

//        printSum(10, 8);  // here 10 & 8  -> Arguments

//        printSum();

//        multiply(9, 2);

//        int r = add(12, 6);
//        System.out.println(r);
    }
}
 
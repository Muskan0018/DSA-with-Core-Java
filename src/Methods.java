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

    static int add (int r, int s, int t) {
        return r + s + t;
    }

    // for Call by Value
    static void solve (int num) {
        System.out.println(num);
        num = num * 10;
        System.out.println(num);
    }


    static void main(String[] args) {
//        System.out.println("Hi");

//        printTable();

//        System.out.println("Bye");

//        printSum(10, 8);  // here 10 & 8  -> Arguments

//        printSum();

//        multiply(9, 2);

//        int result1 = add(12, 6);
//        System.out.println("result1: " + result1);
//
//        int result2 = add(10, 6, 2);
//        System.out.println("result2: " + result2);

//        int num = 5;
//        System.out.println(num);
//        solve(num);     // Call by Value
//        System.out.println(num);
    }
}

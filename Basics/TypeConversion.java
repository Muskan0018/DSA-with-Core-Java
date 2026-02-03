package Basics;
// Type Conversion and Type Casting in Java

public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int intNum = 100;
        double doubleNum = intNum; // int to double
        System.out.println("Implicit Conversion: " + doubleNum);

        // Explicit Type Casting (Narrowing)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // double to int
        System.out.println("Explicit Casting: " + anotherInt);

        int a = 257;
        byte k = (byte) a; // int to byte

        float f = 5.6f;
        int t = (int) f; // float to int

        System.out.println(t);
        System.out.println(k);

        // Type Promotion

        byte a1 = 10;
        byte b1 = 20;
        int results = a1 * b1; // bytes promoted to int
        System.out.println("Type Promotion Result: " + results);
    }  
}

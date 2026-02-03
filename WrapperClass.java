// Wrapper CLass: Converting primitive data types into objects

public class WrapperClass {
    public static void main(String[] args) {
        int num = 18;
        // Integer num1 = new Integer(17); // Boxing: Converting primitive to Wrapper class object

        Integer num1 = num; // Autoboxing

        int num2 = num1.intValue(); // Unboxing: Converting Wrapper class object to primitive

        // int num2 = num1; // Auto unboxing

        System.out.println(num1);

        String str = "123";

        //parseInt is a static method of Integer class
        int num3 = Integer.parseInt(str); // Converting String to int
        System.out.println(str+1); // 1231

    }
}

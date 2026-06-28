public class dataTypes {
    static void main(){

        //Numeric data types - short, byte, int, long

        byte num1 = 127;
        System.out.println(num1);

        short num2 =  500;
        System.out.println(num2);

        int num3 = 50000;
        System.out.println(num3);

        long num4 = 1234567;
        System.out.println(num4);

        // Floating data types - float , double

        float num5 = 18.45f;
        System.out.println(num5);

        double num6 = 18.1467921307451;
        System.out.println(num6);

//        Other data type - char Boolean

        boolean eligibleVote = true;
        System.out.println(eligibleVote);

        char firstCharacter = 'a';
        System.out.println("My first character is: " + (char)(firstCharacter+2));


        // Implicit Conversion (mini data type into large data type)
        long newNum = num1;
        System.out.println("New Num: " + newNum);

        // Explicit Conversion (large data type into mini data type)
         long value1 = 123456789;
         int value2 = (int)value1;
        System.out.println(value2);
    }
}

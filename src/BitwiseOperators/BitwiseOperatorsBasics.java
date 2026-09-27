package BitwiseOperators;

/* Bitwise AND (&) - & returns 1 only when both bits are 1.
*
*  Bitwise OR (|) - | returns 1 if atleast one bit is 1.
*
* Bitwise XOR (^) - It returns 1 when the two bits are different.
*                   Same Bits - 0
*                   Different Bits - 1
*
* Bitwise NOT (~) - It flips every bit. (1 -> 0 or 0 -> 1)
*
* Bitwise Left-Shift (<<) - Left Shift operator moves bits to the left
*
* Signed Right-Shift Operator (>>)-  >> moves bits to the right while preserving the sign bit.
*/

public class BitwiseOperatorsBasics {
    static void main() {

         int a = 5;
         int b = 6;

        System.out.println("Bitwise AND:- " + (a & b));  // 4

        System.out.println("Bitwise OR:- " + (a | b));   // 7

        System.out.println("Bitwise XOR:- " + (a ^ b));  // 3

        System.out.println("Bitwise NOT:- " + (~a));     // -6
        System.out.println("Bitwise NOT:- " + (~b));     // -7

    // Left-Shift Operator (<<)
        System.out.println("LEFT-SHIFT OPERATOR");
        int n = 2;
        for (int i = 1; i <= 32; i++) {
            n = n << 1;
            System.out.println(n);
            System.out.println();
        }

        System.out.println("--------------------------------");

    // Right-Shift Operator (>>)
        System.out.println("RIGHT-SHIFT OPERATOR");
        int x = 100;
        for(int i = 1; i <= 10; i++) {
            x = x >> 1;
            System.out.println(x);
        }

    }
}

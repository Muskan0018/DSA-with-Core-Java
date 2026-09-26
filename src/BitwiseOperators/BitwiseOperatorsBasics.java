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


    }
}

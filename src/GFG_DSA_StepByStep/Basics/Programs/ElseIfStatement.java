package GFG_DSA_StepByStep.Basics.Programs;

//Given a number, you have to use if, else if, else conditional statements according to the following:
//        if number is greater than 100: Print "Big" (without quotes)
//        else if number is smaller than 10: Print "Small" (without quotes)
//        else: Print "Number" (without quotes)

//Input: number = 9
//Output: Small
//Explanation: Here, the else if condition will work as 9 is smaller than 10.


public class ElseIfStatement {
    static void Solution(int number) {
        if(number > 100) {
            System.out.println("Big");
        } else if (number < 10) {
            System.out.println("Small");
        }else{
            System.out.println("Number");
        }
    }
    public static void main(String[] args) {
        Solution(100);
    }
}

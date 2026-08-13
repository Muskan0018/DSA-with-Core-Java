package GFG_DSA_StepByStep.Basics.Programs;

//Given a number x, the task is to print the numbers from x to 0 in decreasing order in a single line.
//
//Example:
//Input: x = 3
//Output: 3 2 1 0
//Explanation: Numbers in decreasing order from 3 are 3 2 1 0.


public class WhileLoopQues {

    static void decreasingOdr(int n){
        while(n >= 0){
            System.out.print(n + " ");
            n--;
        }
    }

    public static void main(String[] args){
        decreasingOdr(10);
    }
}

package GFG_DSA_StepByStep.Basics.Programs;

public class MultiplicationTable {
    static void multipl(int x){
        for (int i = 1; i <= 10; i++) {
            System.out.print((x*i)+" " );
        }
    }
    public static void main(String[] args) {
        multipl(10);
    }
}

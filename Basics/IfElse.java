package Basics;
public class IfElse {
    public static void main(String[] args) {
        int x1 = 18;
        int y1 = 45;
        int z1 = 17;

        if(x1 > y1 && x1 > z1){
            System.out.println(x1);
        }else if(y1 > x1 && y1 > z1){
            System.out.println(y1);
        }else{
            System.out.println(z1);
        }
    }
}
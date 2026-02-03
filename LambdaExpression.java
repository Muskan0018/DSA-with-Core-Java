// Lambda Expression 

interface A {
    int add(int i, int j);
}


public class LambdaExpression {
    public static void main(String[] args) {
        A obj = (int i, int j) ->  i + j;
        int result = obj.add(10, 8);
        System.out.println(result);
    }
}

// Super() - By default in every constructor the first statement is super().
// Super means calling the constructor of a super class.
// this() - this can be used to call another constructor of the same class.

class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A with int: " + n);
    }
}
class B extends A{

    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("in B with int: " + n);
    }
}

public class This_Super {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

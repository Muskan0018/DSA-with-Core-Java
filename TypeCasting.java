class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        // double d = 4.5;
        // // int i = d; // Compilation error: incompatible types
        // int i = (int) d ; // Explicit casting

        // System.out.println(i);

        A obj = (A) new B();  // Upcasting
        obj.show();

        B obj1 = (B) obj;  // Downcasting
        obj1.show2();

        
    }
}

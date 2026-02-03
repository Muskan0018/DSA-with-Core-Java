package oops;

abstract public class MyClass {
    //  complete method
    public void cal(){
        System.out.println("Calculating Result");
    }
    // abstract method
    abstract public void launchrocket();
// abstract class cannot be instantiated
}
class Start{
    public static void main(String[] args) {
//        MyChild myChild = new MyChild();
//        myChild.launchrocket();
//        myChild.cal();

        // object mychild2 having the reference of MyClass
        MyClass mychild2 = new MyChild();
        mychild2.cal();
        mychild2.launchrocket();
    }
}

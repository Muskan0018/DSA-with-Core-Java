/* Method Overriding - A derived class provides a specific implementation of a method already defined in its base class. */


package oops;

public class Parent {
    // Overridden Method
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}
/* public > protected > default > private (accessibility) */

class Child extends Parent{
    // Method Overriding
    public void m1(){
        System.out.println("I am m1() of child");
    }
    /* Co-variant return types are allowed */
}

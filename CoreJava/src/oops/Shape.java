/* Interface - A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to achieve abstraction and multiple inheritance in Java. */

package oops;

public interface Shape {
    int age = 25;     // public, static and final by default
    String area = "London"; // public, static and final by default
    public abstract void calculateArea(int r); // public and abstract by default
}
class Circle implements Shape{
    public void calculateArea(int r){
        System.out.println("Area of circle is: " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.calculateArea(2);
    }

}


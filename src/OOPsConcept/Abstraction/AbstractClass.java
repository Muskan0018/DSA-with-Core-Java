package OOPsConcept.Abstraction;

// Abstract Keyword in Java is used to declare a class as abstract, which means it cannot be instantiated directly. It can contain abstract methods (methods without a body) that must be implemented by subclasses.

// we cannot create an object of an abstract class directly
// we need to create a subclass that extends the abstract class and provides implementations for the abstract methods

// Abstract class (cannot be instantiated)
abstract class Animal {

    // Abstract method (no body)
    // This forces child classes to provide implementation
    abstract void sound();

    // Concrete method (already implemented)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inheriting abstract class
class Dog extends Animal {

    // Providing implementation of abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        // We cannot do: Animal a = new Animal();

        // Instead, we create object of child class
        // but reference it using parent (abstract class)
        Animal obj = new Dog();

        // Calls overridden method (runtime polymorphism)
        obj.sound();

        // Calls concrete method from abstract class
        obj.sleep();
    }
}

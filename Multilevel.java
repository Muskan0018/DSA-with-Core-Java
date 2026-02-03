// Multilevel Inheritance - A class inherits from a derived class, forming a chain of inheritance.

class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Barking...");
    }
}

class Puppy extends Dog{
    public void weep(){
        System.out.println("Weeping...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
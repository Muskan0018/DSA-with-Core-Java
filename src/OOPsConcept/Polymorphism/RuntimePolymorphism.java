package OOPsConcept.Polymorphism;

// Runtime Polymorphism ( Dynamic Polymorphism )
  // Method Overriding

class Shape {

    public void draw() {
        System.out.println("Generic shape drawing...");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {      // Overide the draw method of Shape
        System.out.println("Circle is drawing...");
    }
}

class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle is drawing");
    }
}


public class RuntimePolymorphism {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();

 // Dynamic Method Dispatch is the mechanism Java uses to decide at runtime which overridden method should be called.

// Parent reference + child object → Java chooses the child's overridden method at runtime.
        Shape s = new Rectangle();
        s.draw();

    }
}

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


public class RuntimePolymorphism {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
    }
}

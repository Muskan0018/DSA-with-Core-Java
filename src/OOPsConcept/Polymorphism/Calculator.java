package OOPsConcept.Polymorphism;

//Compile-Time Polymorphism (Static Polymorphism)

   // Method Overloading

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    // overloading add
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

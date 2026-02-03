// Inheritance in Java is a mechanism where one class can inherit properties and behaviors (fields and methods) from another class. The class that inherits is called the subclass (or derived class), and the class being inherited from is called the superclass (or base class). Inheritance promotes code reusability and establishes a hierarchical relationship between classes.

class Calc{      // Superclass
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
}

class AdvCalc extends Calc{    // Subclass
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int sum = obj.add(10, 8);
        int diff = obj.sub(36, 18);
        int product = obj.mul(6, 7);
        int quotient = obj.div(56, 8);

        System.out.println("sum: " + sum + " Difference: " + diff + " Product: " + product + " Quotient: " + quotient);
    }
}

// Object Oriented Programming
// Object: An object is an instance of a class. It is a real-world entity that has state and behavior.(Properties and Behaviors)
// Class: A class is a blueprint for creating objects. It defines the properties and behaviors of an object.



class Calculator{
    int a;
    public int add(int n1, int n2){            // method (add)
        int r = n1 + n2;
        return r;
    }
}

public class ClassObject {
    public static void main(String a[]) {
        int num1 = 4 ;
        int num2 = 5;

        Calculator calc = new Calculator();   // Object  
        int solution = calc.add(num1, num2);  // method call
        // print the solution so the variable is used
        System.out.println(solution);
        // int result = num1 + num2;

        // System.out.println(result);
    }
}

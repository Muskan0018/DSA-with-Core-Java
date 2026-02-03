// Final - Final keyword can be used with classes, methods, and variables in Java.
// A final class cannot be subclassed. A final method cannot be overridden. 
// A final variable's value cannot be changed once initialized.

// Final variable means you cannot change the value of it. 

// FInal Class - when you make a class final, no other class can inherit it.

// Final Method - when you make a method final, no subclass can override it.

class P{
    public void show(){
        System.out.println("in Calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class Q extends P{
    // public void show(){               // This will give error as show() is final in class P
    //     System.out.println("in Q show");
    // }
    public void add(int a, int b){      // This is allowed as add() is not final in class P
        System.out.println("in Q add: " + (a+b));
    }
}

public class Final {
    public static void main(String[] args) {
        P obj = new P();
        obj.show();
        obj.add(5, 10);
        
    }
}

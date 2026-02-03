// Interface - A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to achieve abstraction and multiple inheritance in Java.

interface A{
    int age = 25; // public, static and final by default
    String area = "London"; // public, static and final by default
     void show(); // public and abstract by default
     void config();
}
interface X{
    void run(); // public and abstract by default

}
interface Y extends X{   // interface can inherit another interface
    void run(); // public and abstract by default
}
 class B implements A, X{  // must implement all methods of interface A and X
    public void show(){  // public by default
        System.out.println("Show method implementation in class B");
    }
    public void config(){ 
        System.out.println("Config method implementation in class B");
    }
    public void run(){
        System.out.println("Running...");
    }
 }

public class Interface {
    public static void main(String[] args) {
        A obj;
        obj = new B(); 
        obj.show();
        obj.config();

        X obj1 = new B();  
        obj1.run();
        System.out.println(A.area);
    }
}



// interface  Computer{
//      void code();
// }

// class Laptop implements Computer{
//     public void code(){
//         System.out.println("Coding, Compile, Run...");
//     }
// }

// class Desktop implements Computer{
//     public void code(){
//         System.out.println("Coding, Compile, Run: Faster...");
//     }
// }

// class Developer{
//     public void devApp(Computer lap){
//         lap.code();
//     }
// }

// public class Interface{
//     public static void main(String[] args) {
//         Computer lap = new Laptop();
//         Computer desk = new Desktop();

//         Developer muskan = new Developer();
//         muskan.devApp(desk); 
//     }
// }
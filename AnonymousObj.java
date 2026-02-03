class A{

    public A(){
        System.out.println("Constructor of class A is called");
    }

    public void show(){
        System.out.println("Hello from class A");
    }   
}


public class AnonymousObj {
    public static void main(String[] args) {
        // new A().show();
        new A();// Anonymous Object
    }
}
// Anonymous Object- An object that is instantiated without being assigned to a reference variable is known as an anonymous object. Such objects are used when you need to call a method only once. They are typically used for one-time operations where you don't need to retain a reference to the object for future use.
// Dynamic Method Dispatch - Runtime Polymorphism in Java. is a process in which a call to an overridden method is resolved at runtime rather than compile-time. this is only possible with inheritance. when a superclass reference variable is used to refer to a subclass object, it is known as dynamic method dispatch.

class A {
    public void show(){
        System.out.println("in A");
    }
}

class B extends A {
    public void show(){
        System.out.println("in B");
    }
}
class C extends A {
    public void show(){
        System.out.println("in C");
    }
}

 public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}

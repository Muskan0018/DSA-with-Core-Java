// Anonymous Inner Class - It is a type of inner class without a name and is instantiated in the same place where it is defined. It is used to make the code more concise, especially when you need to create a one-time use class that implements an interface or extends a class.

class A{
    public void show(){
        System.out.println("in A class");
    }
}

class B extends A{
    public void show(){
        System.out.println("in B class");
    }       
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){   // Anonymous Inner Class
            public void show(){
                System.out.println("in Anonymous Inner class");
            }
        };
        obj.show();
    }
}

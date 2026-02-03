// Abstract & Anonymous Class


abstract class A{
    public abstract void show();
    abstract void display();
}
public class AbstractAndAnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){   // Anonymous Inner Class
            public void show(){
                System.out.println("in Anonymous Inner class");
            }
            void display() {
                System.out.println("Display method in Anonymous Inner class");
            }
        };
        obj.show();
        obj.display();
    }
}

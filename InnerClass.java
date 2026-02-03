// Inner Class- 

class Outer {
    private int x = 10;
    public void display() {
        System.out.println("Outer class method");
    }

    class Inner {
        void show() {
            System.out.println(x);
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer object = new Outer();
        object.display();
        Outer.Inner innerObject = object.new Inner();
        innerObject.show();
    }
}

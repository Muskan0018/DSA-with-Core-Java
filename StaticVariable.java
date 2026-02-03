// Static variable: A variable which is declared with static keyword is called static variable.
// It is also known as class variable because it is shared among all the objects of the class

class Mobile{
    String brand;
    int price;
    String network;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + network + " : " + name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 100000;
        m1.network = "5G";
        // m1.name = "iPhone 14 Pro Max";
        Mobile.name = "iPhone 14 Pro Max"; // static variable can be accessed by class name also

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 90000;
        m2.network = "5G";
        m2.name = "Galaxy S21 Ultra";

        m1.name = "Phone";  // If we change static variable using any object, it will be changed for all objects of that class.

        m1.show();
        m2.show();
    }
}


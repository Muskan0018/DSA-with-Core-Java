class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("Static block called");
    }

    public Mobile(){     // default constructor
        brand = "";
        price = 1000;
        System.out.println("Constructor called");
        
    }

    public void show(){    
        System.out.println(brand + " : " + price + " : " +  name);
    }

    public static void show1(Mobile m){  
        System.out.println(m.brand + " : " + m.price + " : " +  m.name);
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile"); // to load the class without creating object



        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 100000;
        // Mobile.name = "iPhone 14 Pro Max";

        // Mobile obj2 = new Mobile();
    }
}

// Static block is used to initialize static variables
// It is executed before the main method at the time of class loading
// It is executed only once per class
//It runs even before the constructor

// If you don't create the object it will not load the class

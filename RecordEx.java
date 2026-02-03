// Record Classes - Record Classes are a special kind of class in Java that act as transparent carriers for immutable data. They provide a concise syntax for declaring classes that are primarily used to store data.


    // class Alien{
    //     private final int id;
    //     private final String name;
        
    //     public Alien(int id, String name) {
    //         this.id = id;
    //         this.name = name;
    //     }

    //     public int getId() {
    //         return id;
    //     }

    //     public String getName() {
    //         return name;
    //     }

        

    //     @Override
    //     public int hashCode() {
    //         final int prime = 31;
    //         int result = 1;
    //         result = prime * result + id;
    //         result = prime * result + ((name == null) ? 0 : name.hashCode());
    //         return result;
    //     }

    //     @Override
    //     public boolean equals(Object obj) {
    //         if (this == obj)
    //             return true;
    //         if (obj == null)
    //             return false;
    //         if (getClass() != obj.getClass())
    //             return false;
    //         Alien other = (Alien) obj;
    //         if (id != other.id)
    //             return false;
    //         if (name == null) {
    //             if (other.name != null)
    //                 return false;
    //         } else if (!name.equals(other.name))
    //             return false;
    //         return true;
    //     }

    //     @Override
    //     public String toString() {
    //         return "Alien [id=" + id + ", name=" + name + "]";
    //     }
    // }

record Alien(int id, String name){ 

    static int num;
    // int age;   // instance variable cannot be declared in record

    public Alien(){    // default constructor
        this(0, " ");     
    }

    public Alien(int id, String name){     
        if(id==0){
            throw new IllegalArgumentException("ID cannot be zero");
        }
        this.id = id;
        this.name = name;
    }
}
    // The compiler automatically provides implementations for:
    // 1. A canonical constructor that initializes all fields.
    // 2. Getter methods for each field (with the same name as the field).
    // 3. Implementations of equals(), hashCode(), and toString() methods.

 // record class can implement interfaces but cannot extend other classes
    
public class RecordEx {
    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Zorg");
        Alien a2 = new Alien(1, "Zorg");
        Alien a3 = new Alien(0, "Xenon");    // will throw exception
        Alien a4 = new Alien();  // default constructor

 // for comparison
        System.out.println(a1.equals(a2)); 

        System.out.println(a1);
        System.out.println(a3);
    }
}

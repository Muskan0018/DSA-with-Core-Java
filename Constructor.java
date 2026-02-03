// Constructor- A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. A constructor has the same name as the class and does not have a return type. It can also take parameters to initialize the object with specific values. It has no return type, not even void.

// Everytime you create an object, the constructor is invoked automatically. So everytime an object is created, the constructor initializes the object.

class Human
{
    private int age;
    private String name;

    // Constructor
    public Human() // Default Constructor
   {
      age = 18;
      name = "Muskan";
        // System.out.println("Constructor is called!");
    }

    // Parameterized Constructor
    public Human(int a , String n){
        age = a;
        this.name = n;
    }

    // Getter and Setter methods
    public int getAge(){
        return age;
    } 

    public String getName(){
        return name;
    }

    public void setAge(int a){
        this.age = a;
        // age = a;
    }

    public void setName(String n){
        this.name = n; 
    }
}


public class Constructor {
    public static void main(String[] args)
  {
        Human obj = new Human();
        Human object = new Human(25, "Alice");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(object.getName() + " : " + object.getAge());
        // obj.setAge(18);
        // obj.setName("Muskan");

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}


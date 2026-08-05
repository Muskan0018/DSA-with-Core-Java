package OOPsConcept;

// Class and Object (Creating an Object)

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor
    public Student() {
        System.out.println("Student default constructor called");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos) {
        System.out.println("Student parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy Constructor
    public Student(Student srcobj) {  // srcobj -> stud
        System.out.println("Student copy constructor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Methods or Behavior
    public void study() {
        System.out.println("Studying");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void bunk() {
        System.out.println("Bunking");
    }

    static void main() {

    }
}

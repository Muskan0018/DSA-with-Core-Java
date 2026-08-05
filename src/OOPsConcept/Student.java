package OOPsConcept;

// Class and Object (Creating an Object)

import javax.sound.midi.Soundbank;

public class Student {
    // Attributes
    private int id;
    private int age;
    private String name;
    private int nos;
    private String bf;

 // Getters and Setters (Encapsulation)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNos() {
        return nos;
    }

    public void setNos(int nos) {
        this.nos = nos;
    }

    // Default Constructor
    public Student() {
        System.out.println("Student default constructor called");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos, String bf) {
        System.out.println("Student parameterized constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.bf = bf;
    }

    // Copy Constructor
//    public Student(Student srcobj) {  // srcobj -> stud
//        System.out.println("Student copy constructor called");
//        this.id = srcobj.id;
//        this.age = srcobj.age;
//        this.name = srcobj.name;
//        this.nos = srcobj.nos;
//    }

    // Methods or Behavior
    public void study() {
        System.out.println(name + " Studying");
    }
    public void sleep() {
        System.out.println(name + " Sleeping");
    }
    public void bunk() {
        System.out.println(name + " Bunking");
    }
    private void bfChatting() {
        System.out.println(name + " bfChatting");
    }



    static void main() {

    }
}

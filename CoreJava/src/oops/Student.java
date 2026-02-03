// Class is a blueprint or template used to create an object. It contains properties & behaviours of an object
// Object is an instance of a class representing real-world entity
// this keyword is used for calling class constructor from inside different constructor of same class. (Refer Current invoking object)
// Inheritance in Java is a mechanism where one class can inherit properties and behaviors (fields and methods) from another class.


package oops;

public class Student {
    // data:data members: intance variable
    int studentId;
    String studentName;
    String studentCity;

    public Student(){     // constructor
        System.out.print("Creating Object");
    }
// Defining multiple constructor within same class is called constructor overloading
    public Student(int st){    // formal parameter (int st)
        System.out.print("Parameterizer constructor: (int)");
    }
    public Student(int i, String n, String c){
        studentId = i;
        studentName = n;
        studentCity = c;
    }

    //Behaviour: member methods: methods: (functions)
    public void study(){
        System.out.println(studentName + " is studying");
    }
    // Same Method Name with Different Parameters is called Method Overloading
   public void study(int i ){

   }
    public void showFullDetails(){
        System.out.println("My name is "+ studentName);
        System.out.println("My id is "+ studentId);
        System.out.println("My city is: "+ studentCity);

    }


}

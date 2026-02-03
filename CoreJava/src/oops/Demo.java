// Object is an instance of a class representing real-world entity

package oops;

public class Demo {
    public static void main(String[] args) {
        // creating object of Student class
        Student st1 = new Student(18, "Virat", "London" );  // object created
//        st1.studentName = "Virat";
//        st1.studentId = 18;
//        st1.studentCity = "London";
//        System.out.println("Id: "+ st1.studentId + " Name: "+st1.studentName + " City: "+ st1.studentCity);
        st1.study();
        st1.showFullDetails();

        Student st2 = new Student(2006);  // actual parameter(2006)
        st2.studentName = "Rohit";
        st2.studentId = 45;
        st2.studentCity = "Mumbai";
//        System.out.println("Id: "+ st2.studentId + " Name: "+st2.studentName + " City: "+ st2.studentCity);
        st2.study();
        st2.showFullDetails();

        Dog d1 = new Dog();
        d1.eat();
    }
}
// Constructor is a special member function (or method) of a class that is automatically called when an object is created. Its main purpose is to initialize the data members of the class.
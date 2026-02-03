package polymorphism;

public class Person {
    public void showDetail(){
        System.out.println("Basic details of Person");
    }
}
class Employee extends Person{
    public void showDetail(){
        System.out.println("Showing the detail of the employee");
    }
}
package PracticeQuestions;

//Design a basic employee management system in Java using object-oriented principles.


// TODO: Create an class called Employee
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter Methods
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }
}


// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails(){
        return "Name: " + getName() + ", Salary: " + getSalary() + ", Department: " + department;
    }
}


public class OOPsExercise {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Employee manager = new Manager("Bob", 80000.0, "IT");
        System.out.println(emp.getDetails());
        System.out.println(manager.getDetails());
    }
}


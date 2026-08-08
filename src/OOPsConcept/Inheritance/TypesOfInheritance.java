package OOPsConcept.Inheritance;

 class Employee {
     protected String name;
     protected int employeeId;

     public Employee(String empName, int empId) {
         this.name = empName;
         this.employeeId = empId;
     }

     public void display() {
         System.out.println("Employee: " + name + ", ID: " + employeeId);
     }
}

// Single Inheritance

class Developer extends Employee {
     private String programmingLanguage;

     public Developer(String empName, int empId, String lang) {
         super(empName, empId);
         this.programmingLanguage = lang;
     }

     public void show() {
         display();
         System.out.println("Specialization: Developer, Programming Language: " + programmingLanguage);
     }
 }

// Multiple Inheritance using INTERFACES

interface ProjectManager {
     void manageProject();   // abstract method (A method without body)
}

interface TeamLead {
     void leadTeam();
}

class TechLead extends Employee implements ProjectManager, TeamLead {
     private String projectManaged;
     private int teamsize;

     TechLead(String empName, int empId, String project, int teamSize) {
         super(empName, empId);
         this.projectManaged = project;
         this.teamsize = teamSize;
     }

    @Override
    public void manageProject() {
        System.out.println("Project Manager managing project: " + projectManaged);
    }

    @Override
    public void leadTeam() {
        System.out.println("Team Lead leading a team of " + teamsize + " members");
    }

    public void displayInfo() {
        display();
        manageProject();
        leadTeam();
    }
}

// Multi-level Inheritance
class HRManager extends Employee {
     public HRManager(String empName, int empId) {
         super(empName, empId);
     }
     public void handleHRDuties() {
         System.out.println("HR Manager handling human resources duties.");
     }
}

class HRDirector extends HRManager {
     public HRDirector(String empName, int empId){
         super(empName, empId);
     }
     public void manageHRDepartment() {
         System.out.println("HR Director managing the HR Department");
     }
}

// Hierarchical Inheritance
class Executive extends Employee {
     public Executive(String empName, int empId) {
         super(empName, empId);
     }
     public void makeExeDecision() {
         System.out.println("Making Executive Decision.");
     }
}
class CEO extends Executive {
     public CEO(String empName, int empId) {
         super(empName, empId);
     }
     public void leadCompany() {
         System.out.println("CEO leads the company.");
     }
}

// Hybrid Inheritance
class MarketingManager extends Employee{
     public MarketingManager(String empName, int empId) {
         super(empName, empId);
     }
     public void createMarketingStrategy() {
         System.out.println("Creating Marketing Strategies");
     }
}

interface SalesManager{
    void boostSales();
}

class BusinessDevelopmentManager extends MarketingManager implements SalesManager {
     BusinessDevelopmentManager(String empName, int empId) {
         super(empName, empId);
     }

     public void coordinateBusinessDevelopment() {
         createMarketingStrategy();
         boostSales();
         System.out.println("Business Development Manager coordinating business development efforts.");
     }

    @Override
    public void boostSales() {
        System.out.println("Boost Sales.");
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {

        // Single Inheritance
//        Developer dev = new Developer("Muskan", 18, "Java");
//        dev.show();

        // Multiple Inheritance
//        TechLead techleads = new TechLead("Richa", 29, "Project X", 5);
//        techleads.displayInfo();

        // Multi-level Inheritance
        HRDirector hrDirector = new HRDirector("Rishank", 200);
//        hrDirector.handleHRDuties();
//        hrDirector.manageHRDepartment();

        // Hierarchical Inheritance
        CEO ceos = new CEO("Muskan Mishra", 2006);
//        ceos.leadCompany();

        // Hybrid Inheritance
        BusinessDevelopmentManager bdManager = new BusinessDevelopmentManager("Virat", 18);
        bdManager.coordinateBusinessDevelopment();

    }
}

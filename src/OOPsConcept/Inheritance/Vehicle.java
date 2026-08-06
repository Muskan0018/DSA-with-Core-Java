package OOPsConcept.Inheritance;

// Inheritance

public class Vehicle {       // Parent Class

    public String name;
    public String model;
    public int noOfTyres;

    // Default Constructor
    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

 // Parameterize Constructor
    Vehicle(String name, String  model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopEngine() {
        System.out.printf("Engine is stopping of %s : %s\n", name, model);
    }
}

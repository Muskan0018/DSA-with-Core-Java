package OOPsConcept.Inheritance;

public class Car extends Vehicle{       // Derived Class
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres);    // Parent Class k constructor ko call krne k liye
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

//        super.startEngine();       // Parent Class k method call krne k liye
    }

    public void startAC() {
        System.out.println("AC started of " + name);
    }
}


// Super() - By default in every constructor the first statement is super().
// Super means calling the constructor of a super class.
// this() - this can be used to call another constructor of the same class.

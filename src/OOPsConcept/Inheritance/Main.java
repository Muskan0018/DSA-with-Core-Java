package OOPsConcept.Inheritance;

public class Main {
    public static void main(String [] args) {
        Car c = new Car("Mercedezs-Benz", "CLA", 4, 2, "Automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        System.out.println("--------------------------------------");

        MotorCycle m = new MotorCycle("Royal Enfield", "GT", 2, "Clip-on handlebars", "telescopic/twin gas");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}

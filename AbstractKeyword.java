// Abstract Keyword in Java is used to declare a class as abstract, which means it cannot be instantiated directly. It can contain abstract methods (methods without a body) that must be implemented by subclasses.

// we cannot create an object of an abstract class directly
// we need to create a subclass that extends the abstract class and provides implementations for the abstract methods

abstract class Car{
    public abstract void drive();

    public abstract void stop();

    public void playMusic(){
        System.out.println("Playing music in the car");
    }
}
abstract class WagonR extends Car{  
    // public void drive(){
    //     System.out.println("Driving the wagonR");
    // }
    public void stop(){
        System.out.println("Stopping the wagonR");
    }
}
class Swift extends WagonR{   // concrete class
    public void drive() {
        System.out.println("Driving the Swift");
    }
    
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car c1 = new Swift();
        c1.drive();
        c1.playMusic();
        c1.stop();
    }
}

package OOPsConcept.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("First Add: " + cal.add(10, 8));
        System.out.println("Second Add: " + cal.add(10, 20, 30));
        System.out.println("Third Add: " + cal.add(12, 3.0));
    }
}

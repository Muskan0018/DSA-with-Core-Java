package polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("for testing");
//        Students stud = new Students();
//        stud.read("hello");
//        Person person = new Person();
//        person.showDetail();
        Person per1 = new Employee();
//        per1.showDetail();

        Ram r1 = new Ram();
        r1.doWork(per1);
    }
}

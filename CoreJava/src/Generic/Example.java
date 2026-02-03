package Generic;

public class Example {
    public static void main(String[] args) {

        Box<String> b1 =  new Box<>("Hello");
        Box<String> b2 = new Box<>("World");

        System.out.println("String: " + b1.getValue());
        System.out.println(b2.container.getClass().getName());
        System.out.println("____________________________________________");
        Box<Integer> b3 =  new Box<>(100);
        System.out.println("Integer: " + b3.getValue());
        System.out.println(b3.container.getClass().getName());
        System.out.println("___________________________________________");
        Box<Boolean>  b4 =  new Box<>(true);
        System.out.println("Boolean: " + b4.getValue());
        System.out.println("______________________________________________");

        b1.performSomeTask();
        b2.performSomeTask();
        b3.performSomeTask();
    }
}

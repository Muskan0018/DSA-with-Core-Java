package OOPsConcept;

public class App {
    public static void main(String[] ags) {
        //Default Constructor
//        Student A = new Student();
//        A.id = 14;
//        A.age = 20;
//        A.name = "Muskan";
//        A.nos = 2;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();


//        Parameterized Constructor
        Student stud = new Student(1, 20, "Bagguu", 4);
        System.out.println(stud.id);
        System.out.println(stud.age);
        System.out.println(stud.name);
        System.out.println(stud.nos);

        stud.bunk();
        stud.sleep();
        stud.study();



//        Copy Constructor
//        Student cop = new Student(stud);
//        System.out.println(cop.id);
//        System.out.println(cop.age);
//        System.out.println(cop.name);
//        System.out.println(cop.nos);
//
//        cop.sleep();

    }
}

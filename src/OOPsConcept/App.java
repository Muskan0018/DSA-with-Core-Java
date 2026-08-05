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
            // Encapsulation
        Student stud = new Student(1, 20, "Anushka", 4, "Virat");
        System.out.println("Id: " + stud.getId());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Name: " + stud.getName());
        System.out.println("Nos: " + stud.getNos());
        System.out.println("Bf: " + stud.getBf());

        stud.setAge(30);

//        stud.bunk();
//        stud.sleep();
//        stud.study();
//        stud.bfChatting();



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

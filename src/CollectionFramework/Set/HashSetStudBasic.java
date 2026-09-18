package CollectionFramework.Set;

import java.util.HashSet;

public class HashSetStudBasic {
    public static void main(String[] args) {

        HashSet<Student> stud = new HashSet<>();

        Student s1 = new Student(1, "Virat");
        Student s2 = new Student(1, "Virat");
        Student s3 = new Student(1, "Virat");

        stud.add(s1);
        stud.add(s2);
        stud.add(s3);

        System.out.println(stud);
        System.out.println("That's why we override these two methods- equals() & hashCode()");
    }
}

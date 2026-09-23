package CollectionFramework.ComparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable - It is used when we want to define the "Natural/Default Ordering" of objects

public class MainStud {
    public static void main(String[] args) {

        List<Students> students = new ArrayList<>();

        students.add(new Students(25, "Rishank", 75));
        students.add(new Students(21, "Pratiksha", 50));
        students.add(new Students(19, "Muskan", 48));
        students.add(new Students(24, "Richa", 65));
        students.add(new Students(19, "Billu", 20));

        System.out.println("Students List: " + students);
        System.out.println("----------------------------------------------------------------------");
        Collections.sort(students);
        System.out.println("After sorting: " + students);

    }
}

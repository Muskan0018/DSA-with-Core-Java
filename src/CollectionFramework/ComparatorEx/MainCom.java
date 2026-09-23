package CollectionFramework.ComparatorEx;

import CollectionFramework.ComparableEx.Students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCom {
    public static void main(String[] args) {

            List<StudentCom> stud = new ArrayList<>();

            stud.add(new StudentCom(25, "Rishank", 75));
            stud.add(new StudentCom(21, "Pratiksha", 50));
            stud.add(new StudentCom(19, "Muskan", 48));
            stud.add(new StudentCom(24, "Richa", 65));
            stud.add(new StudentCom(19, "Billu", 20));

            System.out.println("Students List: " + stud);
            System.out.println("----------------------------------------------------------------------");


            Collections.sort(stud, new Comparator<StudentCom>() {
                @Override
                public int compare(StudentCom o1, StudentCom o2) {
                    return o1.weight - o2.weight;  // for ascending order
                }
            });

            System.out.println("After sorting: " + stud);

        }
}

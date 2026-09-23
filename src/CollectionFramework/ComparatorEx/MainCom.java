package CollectionFramework.ComparatorEx;

import CollectionFramework.ComparableEx.Students;

import java.util.*;

public class MainCom {
    public static void main(String[] args) {

//            List<StudentCom> stud = new ArrayList<>();
//
//            stud.add(new StudentCom(25, "Rishank", 75));
//            stud.add(new StudentCom(21, "Pratiksha", 50));
//            stud.add(new StudentCom(19, "Muskan", 48));
//            stud.add(new StudentCom(24, "Richa", 65));
//            stud.add(new StudentCom(19, "Billu", 20));
//
//            System.out.println("Students List: " + stud);
//            System.out.println("----------------------------------------------------------------------");

            // we don't need to write comparator there because we can already created a separate class that implementing Comparator

//            Collections.sort(stud, new Comparator<StudentCom>() {
//                @Override
//                public int compare(StudentCom o1, StudentCom o2) {
//                    return o1.weight - o2.weight;  // for ascending order
//                }
//            });

//        Collections.sort(stud, new WeightComaparator());

        // LAMBDA EXPRESSION

//        Collections.sort(stud, (o1, o2) -> o1.weight - o2.weight );
//
//
//            System.out.println("After sorting: " + stud);

        Integer[] arr = {4,5,1, 8,3,9};
//        Arrays.sort(arr);  // it is for ascending order
        Arrays.sort(arr, new ArraysExComparator());
        for(int a : arr) {
            System.out.print(a + " ");
        }

        }
}

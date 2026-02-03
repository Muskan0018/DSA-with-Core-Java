package Collection;

import java.util.ArrayList;
import java.util.Vector;
import java.util.HashSet;
import java.util.TreeSet;

public class ListEx {

    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

        /*
         * Creating Collection [ ArrayList ]
         * 1) Type Safe - Same type of elements (objects) are added to collection
         * 2) Un-Type Safe - Different types of elements can be added to collection
         */
        // Creating Type-Safe Collection
        ArrayList<String> names = new ArrayList<>(); // Generic way of creating collection
        names.add("Muskan");
        names.add("Pratiksha");
        names.add("Richa");
        names.add("Rishank");

        names.remove("Richa"); // remove

        System.out.println("NAME: " + names);
        // System.out.println(names.get(1));
        // System.out.println(names.get(2));

        // size
        System.out.println("SIZE: " + names.size());

        // checking item is there or not. Type ka equals method call krta h checking k
        // liye
        System.out.println(names.contains("Muskan"));

        // setting value
        names.set(1, "Anant"); // it removes current one then add new one

        names.add(1, "Rohit"); // it shifts the current and add new

        System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("VECTOR: " + vector);

        // Check for empty
        // System.out.println(names.isEmpty());

        // Creating Un-Type Safe Collection
        // LinkedList list = new LinkedList<>();
        // list.add("Virat");
        // list.add(18);
        // list.add(93.5);
        // list.add(true);
        // System.out.println(list);

        System.out.println("____________________________________________________________________");

        HashSet<Double> nms = new HashSet<>(); // order not preserved
        nms.add(18.18);
        nms.add(45.7718);
        nms.add(17.77);
        nms.add(99.96);
        // nms.add(99.96); // duplicates are not allowed

        System.out.println("HashSet EX: " + nms);

        TreeSet<Double> tset = new TreeSet<>(); // Sorted in ascending order
        tset.addAll(nms);
        System.out.println("TreeSet Ex: " + tset);

    }
}
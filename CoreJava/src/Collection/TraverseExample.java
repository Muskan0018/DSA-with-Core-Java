package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();   // Generic way of creating collection
        name.add("Muskan");
        name.add("Pratiksha");
        name.add("Richa");
        name.add("Rishank");
        name.add("Anant");

        //  Traversing using for each loop
        for(String str : name)
        {
            System.out.print(str + "\t" + str.length() + "\t");
            // for resverse
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("__________________________ ITERATOR _____________________________________");

        // Traversing using ITERATOR : Forward Traversing
        Iterator<String> itr = name.iterator();
        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++ LISTITERATOR +++++++++++++++++++");

        // LISITERATOR :  Backward Traversing of collection
        ListIterator<String> litr = name.listIterator(name.size());
        while (litr.hasPrevious())
        {
            String prev = litr.previous();
            System.out.println(prev);
        }

        // Enumeration

        System.out.println("******************** FOR EACH METHOD *************************");

        // for each method
        name.forEach(e -> {
            System.out.println(e);
        });
        System.out.println("____________ SORTING OF ELEMENTS ____________");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(name);
        set.forEach(e -> {
            System.out.println(e);
        });

    }
}
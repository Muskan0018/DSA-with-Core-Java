package CollectionFramework.Set;


/*
 * =========================================================
 * PART 1: LinkedHashSet
 * =========================================================
 *
 * LinkedHashSet is a class in Java that implements the Set interface.
 * It is used to store unique elements and it maintain insertion order.
 * It has preserved order
 *
 * retainAll() - retains all the elements in the set that are also present in another specified set (give the common elements of the both sets)
 * containsAll() - return true if the Set contains all the elements of the specified collection
 */

import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> linkset = new java.util.LinkedHashSet<>();

        linkset.add(50);
        linkset.add(10);
        linkset.add(20);
        linkset.add(10);
        linkset.add(40);
        linkset.add(30);

        System.out.println("LinkedHashSet: " + linkset);

    }
}

package CollectionFramework.Set;

import java.util.Set;
import java.util.TreeSet;

/*
 * =========================================================
 * PART 1: TreeSet
 * =========================================================
 *
 * TreeSet is a class in Java that implements the Set interface.
 * It is used to store unique elements and it maintain insertion order.
 * It has preserved order
 *
 * retainAll() - retains all the elements in the set that are also present in another specified set (give the common elements of the both sets)
 * containsAll() - return true if the Set contains all the elements of the specified collection
 */

public class TreeSetBasics {
    public static void main(String[] args) {

        Set<Integer> t1 = new TreeSet<>();

        t1.add(10);
        t1.add(12);
        t1.add(14);
        t1.add(16);
        t1.add(10);

        System.out.println("TreeSet: " + t1);
    }
}

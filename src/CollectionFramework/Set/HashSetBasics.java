package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

/*
 * =========================================================
 * PART 1: HashSet
 * =========================================================
 *
 * HashSet is a class in Java that implements the Set interface.
 * It is used to store unique elements and does not maintain insertion order.
 *
 * retainAll() - retains all the elements in the set that are also present in another specified set (give the common elements of the both sets)
 * containsAll() - return true if the Set contains all the elements of the specified collection
 */

public class HashSetBasics {
   public static void main(String[] args) {

       Set<Integer> set1 = new HashSet<>();
       Set<Integer> set2 = new HashSet<>();

       set1.add(1);
       set1.add(2);
       set1.add(3);
       set1.add(4);
       System.out.println("Set1: " + set1);

       set2.add(4);
       set2.add(6);
       set2.add(2);
       set2.add(8);
       System.out.println("Set2: " + set2);

       // retainAll() - retains all the elements in the set that are also present in another specified set
       set1.retainAll(set2);  // give the common elements of the both sets

       System.out.println("Retain: " + set1);

       // containsAll() - return true if the Set contains all the elements of the specified collection
       System.out.println("set1 contains all the elements of Set2: " + set1.containsAll(set2));

//       Set<Integer> st = new HashSet<>();
//       st.add(10);
//       st.add(20);
//       st.add(10);
//       st.add(30);
//       st.add(10);
//       System.out.println("HashSet: " + st);

    }
}

package CollectionFramework.Set;

import java.util.Iterator;
import java.util.HashSet;

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

public class HashSetAllMethods {
   public static void main(String[] args) {

               // =========================================================
               // 1. Creating a HashSet
               // =========================================================

               // HashSet stores UNIQUE elements.
               // It does NOT maintain insertion order.
               HashSet<Integer> set = new HashSet<>();


               // =========================================================
               // 2. add() method
               // =========================================================

               // Definition:
               // add() is used to add an element to the HashSet.
               // It returns true if the element is successfully added.
               // It returns false if the element already exists.

               set.add(10);
               set.add(20);
               set.add(30);

               System.out.println("After add(): " + set);


               // Adding a duplicate element
               boolean result = set.add(20);

               System.out.println("Was 20 added again? " + result);
               System.out.println("Set after adding duplicate: " + set);


               // =========================================================
               // 3. addAll() method
               // =========================================================

               // Definition:
               // addAll() adds all elements from another collection
               // into the current HashSet.
               // Duplicate elements are automatically ignored.

               HashSet<Integer> secondSet = new HashSet<>();

               secondSet.add(30);
               secondSet.add(40);
               secondSet.add(50);

               set.addAll(secondSet);

               System.out.println("After addAll(): " + set);


               // =========================================================
               // 4. contains() method
               // =========================================================

               // Definition:
               // contains() checks whether a particular element
               // exists in the HashSet.
               // It returns true if the element exists,
               // otherwise it returns false.

               System.out.println("Contains 30? " + set.contains(30));
               System.out.println("Contains 100? " + set.contains(100));


               // =========================================================
               // 5. containsAll() method
               // =========================================================

               // Definition:
               // containsAll() checks whether ALL elements of another
               // collection are present in the current HashSet.

               HashSet<Integer> checkSet = new HashSet<>();

               checkSet.add(10);
               checkSet.add(20);

               System.out.println(
                       "Contains all elements of checkSet? "
                               + set.containsAll(checkSet)
               );


               // =========================================================
               // 6. size() method
               // =========================================================

               // Definition:
               // size() returns the total number of elements
               // currently present in the HashSet.

               System.out.println("Size of set: " + set.size());


               // =========================================================
               // 7. isEmpty() method
               // =========================================================

               // Definition:
               // isEmpty() checks whether the HashSet contains
               // zero elements.
               // It returns true if the set is empty,
               // otherwise false.

               System.out.println("Is set empty? " + set.isEmpty());


               // =========================================================
               // 8. remove() method
               // =========================================================

               // Definition:
               // remove() removes a particular element from the HashSet.
               // It returns true if the element was found and removed.

               set.remove(20);

               System.out.println("After remove(20): " + set);


               // =========================================================
               // 9. removeAll() method
               // =========================================================

               // Definition:
               // removeAll() removes all elements from the current HashSet
               // that are also present in another collection.

               HashSet<Integer> removeSet = new HashSet<>();

               removeSet.add(30);
               removeSet.add(40);

               set.removeAll(removeSet);

               System.out.println("After removeAll(): " + set);


               // =========================================================
               // 10. retainAll() method
               // =========================================================

               // Definition:
               // retainAll() keeps ONLY the elements that are also
               // present in another collection.
               // All other elements are removed.

               HashSet<Integer> retainSet = new HashSet<>();

               retainSet.add(10);
               retainSet.add(50);

               set.retainAll(retainSet);

               System.out.println("After retainAll(): " + set);


               // =========================================================
               // 11. iterator() method
               // =========================================================

               // Definition:
               // iterator() returns an Iterator object.
               // It is used to traverse the elements of the HashSet.

               System.out.println("Using Iterator:");

               Iterator<Integer> iterator = set.iterator();

               while (iterator.hasNext()) {
                   System.out.println(iterator.next());
               }


               // =========================================================
               // 12. forEach() method
               // =========================================================

               // Definition:
               // forEach() performs a specified action
               // for each element in the HashSet.

               System.out.println("Using forEach():");

               set.forEach(element -> System.out.println(element));


               // =========================================================
               // 13. toArray() method
               // =========================================================

               // Definition:
               // toArray() converts the HashSet into an Object array.

               Object[] array = set.toArray();

               System.out.println("Array elements:");

               for (Object element : array) {
                   System.out.println(element);
               }


               // =========================================================
               // 14. clear() method
               // =========================================================

               // Definition:
               // clear() removes ALL elements from the HashSet.

               set.clear();

               System.out.println("After clear(): " + set);


               // =========================================================
               // 15. isEmpty() after clear()
               // =========================================================

               System.out.println("Is set empty now? " + set.isEmpty());


//       Set<Integer> set1 = new HashSet<>();
//       Set<Integer> set2 = new HashSet<>();
//
//       set1.add(1);
//       set1.add(2);
//       set1.add(3);
//       set1.add(4);
//       System.out.println("Set1: " + set1);
//
//       set2.add(4);
//       set2.add(6);
//       set2.add(2);
//       set2.add(8);
//       System.out.println("Set2: " + set2);
//
//       // retainAll() - retains all the elements in the set that are also present in another specified set
//       set1.retainAll(set2);  // give the common elements of the both sets
//
//       System.out.println("Retain: " + set1);
//
//       // containsAll() - return true if the Set contains all the elements of the specified collection
//       System.out.println("set1 contains all the elements of Set2: " + set1.containsAll(set2));
//
////       Set<Integer> st = new HashSet<>();
////       st.add(10);
////       st.add(20);
////       st.add(10);
////       st.add(30);
////       st.add(10);
////       System.out.println("HashSet: " + st);

   }
}
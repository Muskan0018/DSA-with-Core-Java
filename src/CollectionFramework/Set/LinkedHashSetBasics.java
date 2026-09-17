package CollectionFramework.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;


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


public class LinkedHashSetBasics {
    public static void main(String[] args) {

                // =========================================================
                // 1. Creating a LinkedHashSet
                // =========================================================

                // LinkedHashSet stores UNIQUE elements
                // and maintains INSERTION ORDER.
                LinkedHashSet<Integer> set = new LinkedHashSet<>();


                // =========================================================
                // 2. add() method
                // =========================================================

                // Definition:
                // add() is used to insert an element into the LinkedHashSet.
                // It returns true if the element was added successfully.
                // It returns false if the element already exists.

                set.add(10);
                set.add(20);
                set.add(30);

                System.out.println("After add(): " + set);


                // Adding a duplicate element
                boolean result = set.add(20);

                System.out.println("Was 20 added again? " + result);
                System.out.println("Set after duplicate: " + set);


                // =========================================================
                // 3. addAll() method
                // =========================================================

                // Definition:
                // addAll() adds all elements from another collection
                // into the current LinkedHashSet.
                // Duplicate elements are automatically ignored.

                LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

                secondSet.add(30);
                secondSet.add(40);
                secondSet.add(50);

                set.addAll(secondSet);

                System.out.println("After addAll(): " + set);


                // =========================================================
                // 4. contains() method
                // =========================================================

                // Definition:
                // contains() checks whether a particular element exists
                // in the LinkedHashSet.
                // It returns true or false.

                System.out.println("Contains 30? " + set.contains(30));
                System.out.println("Contains 100? " + set.contains(100));


                // =========================================================
                // 5. containsAll() method
                // =========================================================

                // Definition:
                // containsAll() checks whether all elements of another
                // collection are present in the current LinkedHashSet.

                LinkedHashSet<Integer> checkSet = new LinkedHashSet<>();

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
                // present in the LinkedHashSet.

                System.out.println("Size of set: " + set.size());


                // =========================================================
                // 7. isEmpty() method
                // =========================================================

                // Definition:
                // isEmpty() checks whether the LinkedHashSet contains
                // zero elements.
                // It returns true if empty, otherwise false.

                System.out.println("Is set empty? " + set.isEmpty());


                // =========================================================
                // 8. remove() method
                // =========================================================

                // Definition:
                // remove() removes a particular element from the set.
                // It returns true if the element was removed.

                set.remove(20);

                System.out.println("After remove(20): " + set);


                // =========================================================
                // 9. removeAll() method
                // =========================================================

                // Definition:
                // removeAll() removes all elements from the current set
                // that are also present in another collection.

                LinkedHashSet<Integer> removeSet = new LinkedHashSet<>();

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

                LinkedHashSet<Integer> retainSet = new LinkedHashSet<>();

                retainSet.add(10);
                retainSet.add(50);

                set.retainAll(retainSet);

                System.out.println("After retainAll(): " + set);


                // =========================================================
                // 11. iterator() method
                // =========================================================

                // Definition:
                // iterator() returns an Iterator that can be used
                // to traverse the elements of the LinkedHashSet.

                System.out.println("Using Iterator:");

                Iterator<Integer> iterator = set.iterator();

                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }


                // =========================================================
                // 12. forEach() method
                // =========================================================

                // Definition:
                // forEach() performs an action for every element
                // in the LinkedHashSet.

                System.out.println("Using forEach():");

                set.forEach(element -> System.out.println(element));


                // =========================================================
                // 13. toArray() method
                // =========================================================

                // Definition:
                // toArray() converts the LinkedHashSet into an Object array.

                Object[] array = set.toArray();

                System.out.println("Array elements:");

                for (Object element : array) {
                    System.out.println(element);
                }


                // =========================================================
                // 14. clear() method
                // =========================================================

                // Definition:
                // clear() removes ALL elements from the LinkedHashSet.

                set.clear();

                System.out.println("After clear(): " + set);


                // =========================================================
                // 15. Check isEmpty() after clear()
                // =========================================================

                System.out.println("Is set empty now? " + set.isEmpty());

    }
}

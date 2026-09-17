package CollectionFramework.Set;

import java.util.Iterator;
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

                // =========================================================
                // 1. Creating a TreeSet
                // =========================================================

                // TreeSet stores UNIQUE elements.
                // TreeSet automatically stores elements in SORTED order.
                // For Integer, sorting is in ascending order.

                TreeSet<Integer> set = new TreeSet<>();


                // =========================================================
                // 2. add() method
                // =========================================================

                // Definition:
                // add() is used to add an element to the TreeSet.
                // It returns true if the element is successfully added.
                // It returns false if the element already exists.

                set.add(40);
                set.add(10);
                set.add(30);
                set.add(20);

                System.out.println("After add(): " + set);

                // Output:
                // [10, 20, 30, 40]


                // Adding duplicate element
                boolean result = set.add(20);

                System.out.println("Was 20 added again? " + result);
                System.out.println("Set: " + set);

                // 20 is not added because TreeSet does not allow duplicates.


                // =========================================================
                // 3. addAll() method
                // =========================================================

                // Definition:
                // addAll() adds all elements from another collection
                // into the TreeSet.
                // Duplicate elements are automatically ignored.

                TreeSet<Integer> secondSet = new TreeSet<>();

                secondSet.add(50);
                secondSet.add(60);
                secondSet.add(30);

                set.addAll(secondSet);

                System.out.println("After addAll(): " + set);

                // Output:
                // [10, 20, 30, 40, 50, 60]


                // =========================================================
                // 4. contains() method
                // =========================================================

                // Definition:
                // contains() checks whether a particular element
                // exists in the TreeSet.
                // Returns true if found, otherwise false.

                System.out.println("Contains 30? " + set.contains(30));
                System.out.println("Contains 100? " + set.contains(100));


                // =========================================================
                // 5. containsAll() method
                // =========================================================

                // Definition:
                // containsAll() checks whether ALL elements of another
                // collection are present in the TreeSet.

                TreeSet<Integer> checkSet = new TreeSet<>();

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
                // present in the TreeSet.

                System.out.println("Size: " + set.size());


                // =========================================================
                // 7. isEmpty() method
                // =========================================================

                // Definition:
                // isEmpty() checks whether the TreeSet contains
                // zero elements.

                System.out.println("Is set empty? " + set.isEmpty());


                // =========================================================
                // 8. remove() method
                // =========================================================

                // Definition:
                // remove() removes a particular element from the TreeSet.
                // Returns true if the element was removed.

                set.remove(20);

                System.out.println("After remove(20): " + set);


                // =========================================================
                // 9. removeAll() method
                // =========================================================

                // Definition:
                // removeAll() removes all elements from the current TreeSet
                // that are also present in another collection.

                TreeSet<Integer> removeSet = new TreeSet<>();

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

                TreeSet<Integer> retainSet = new TreeSet<>();

                retainSet.add(10);
                retainSet.add(50);

                set.retainAll(retainSet);

                System.out.println("After retainAll(): " + set);


                // =========================================================
                // 11. first() method
                // =========================================================

                // Definition:
                // first() returns the LOWEST (smallest) element
                // present in the TreeSet.

                System.out.println("First element: " + set.first());


                // =========================================================
                // 12. last() method
                // =========================================================

                // Definition:
                // last() returns the HIGHEST (largest) element
                // present in the TreeSet.

                System.out.println("Last element: " + set.last());


                // =========================================================
                // 13. higher() method
                // =========================================================

                // Definition:
                // higher(element) returns the smallest element
                // that is STRICTLY GREATER than the given element.

                System.out.println("Higher than 10: " + set.higher(10));


                // =========================================================
                // 14. lower() method
                // =========================================================

                // Definition:
                // lower(element) returns the largest element
                // that is STRICTLY LESS than the given element.

                System.out.println("Lower than 50: " + set.lower(50));


                // =========================================================
                // 15. ceiling() method
                // =========================================================

                // Definition:
                // ceiling(element) returns the smallest element
                // that is GREATER THAN OR EQUAL TO the given element.

                System.out.println("Ceiling of 10: " + set.ceiling(10));


                // =========================================================
                // 16. floor() method
                // =========================================================

                // Definition:
                // floor(element) returns the largest element
                // that is LESS THAN OR EQUAL TO the given element.

                System.out.println("Floor of 45: " + set.floor(45));


                // =========================================================
                // 17. pollFirst() method
                // =========================================================

                // Definition:
                // pollFirst() removes and returns the FIRST (smallest)
                // element from the TreeSet.

                Integer first = set.pollFirst();

                System.out.println("Removed first element: " + first);
                System.out.println("Set after pollFirst(): " + set);


                // =========================================================
                // 18. pollLast() method
                // =========================================================

                // Definition:
                // pollLast() removes and returns the LAST (largest)
                // element from the TreeSet.

                Integer last = set.pollLast();

                System.out.println("Removed last element: " + last);
                System.out.println("Set after pollLast(): " + set);


                // =========================================================
                // 19. headSet() method
                // =========================================================

                // Definition:
                // headSet(toElement) returns a view containing
                // elements LESS THAN the specified element.
                //
                // The specified element is NOT included.

                TreeSet<Integer> numbers = new TreeSet<>();

                numbers.add(10);
                numbers.add(20);
                numbers.add(30);
                numbers.add(40);
                numbers.add(50);

                System.out.println("Original set: " + numbers);

                System.out.println("headSet(40): " + numbers.headSet(40));

                // Output:
                // [10, 20, 30]


                // =========================================================
                // 20. tailSet() method
                // =========================================================

                // Definition:
                // tailSet(fromElement) returns a view containing
                // elements GREATER THAN OR EQUAL TO the specified element.

                System.out.println("tailSet(30): " + numbers.tailSet(30));

                // Output:
                // [30, 40, 50]


                // =========================================================
                // 21. subSet() method
                // =========================================================

                // Definition:
                // subSet(fromElement, toElement) returns a view
                // containing elements from fromElement (inclusive)
                // to toElement (exclusive).

                System.out.println(
                        "subSet(20, 50): " + numbers.subSet(20, 50)
                );

                // Output:
                // [20, 30, 40]


                // =========================================================
                // 22. headSet() with inclusive option
                // =========================================================

                // Definition:
                // headSet(toElement, inclusive)
                // returns elements less than toElement.
                //
                // If inclusive = true, toElement is also included.

                System.out.println(
                        "headSet(30, true): " + numbers.headSet(30, true)
                );

                // Output:
                // [10, 20, 30]


                // =========================================================
                // 23. tailSet() with inclusive option
                // =========================================================

                // Definition:
                // tailSet(fromElement, inclusive)
                // returns elements greater than fromElement.
                //
                // If inclusive = true, fromElement is included.

                System.out.println(
                        "tailSet(30, true): " + numbers.tailSet(30, true)
                );


                // =========================================================
                // 24. subSet() with inclusive/exclusive options
                // =========================================================

                // Definition:
                // subSet(fromElement, fromInclusive,
                //        toElement, toInclusive)
                //
                // Allows us to decide whether the starting and ending
                // elements should be included.

                System.out.println(
                        "subSet(20, true, 50, true): "
                                + numbers.subSet(20, true, 50, true)
                );

                // Output:
                // [20, 30, 40, 50]


                // =========================================================
                // 25. descendingSet() method
                // =========================================================

                // Definition:
                // descendingSet() returns a view of the TreeSet
                // in DESCENDING (reverse) order.

                System.out.println(
                        "Descending set: " + numbers.descendingSet()
                );

                // Output:
                // [50, 40, 30, 20, 10]


                // =========================================================
                // 26. descendingIterator() method
                // =========================================================

                // Definition:
                // descendingIterator() returns an Iterator
                // that traverses the TreeSet from largest to smallest.

                System.out.println("Descending Iterator:");

                Iterator<Integer> descendingIterator =
                        numbers.descendingIterator();

                while (descendingIterator.hasNext()) {
                    System.out.println(descendingIterator.next());
                }


                // =========================================================
                // 27. iterator() method
                // =========================================================

                // Definition:
                // iterator() returns an Iterator that traverses
                // the elements in ascending order.

                System.out.println("Normal Iterator:");

                Iterator<Integer> iterator = numbers.iterator();

                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }


                // =========================================================
                // 28. forEach() method
                // =========================================================

                // Definition:
                // forEach() performs a specified action
                // for each element in the TreeSet.

                System.out.println("Using forEach():");

                numbers.forEach(element -> System.out.println(element));


                // =========================================================
                // 29. toArray() method
                // =========================================================

                // Definition:
                // toArray() converts the TreeSet into an Object array.

                Object[] array = numbers.toArray();

                System.out.println("Array elements:");

                for (Object element : array) {
                    System.out.println(element);
                }


                // =========================================================
                // 30. clear() method
                // =========================================================

                // Definition:
                // clear() removes ALL elements from the TreeSet.

                numbers.clear();

                System.out.println("After clear(): " + numbers);


                // =========================================================
                // 31. isEmpty() after clear()
                // =========================================================

                System.out.println("Is set empty now? " + numbers.isEmpty());

//        Set<Integer> t1 = new TreeSet<>();
//        t1.add(10);
//        t1.add(12);
//        t1.add(14);
//        t1.add(16);
//        t1.add(10);  // ignored
//        System.out.println("TreeSet: " + t1);
    }
}

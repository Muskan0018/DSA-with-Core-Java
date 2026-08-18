package CollectionFramework;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // List or Collection -> Interface

        // ArrayList -> Concrete Class

        ArrayList<Integer> list = new ArrayList<>();   //we can create either taking the reference of ArrayList<> or List<> or Collection<>
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

        // add() -> insert the specified element to the collection
        list.add(18);
        list.add(45);
        list.add(17);
        list.add(22);
        list.add(88);
        System.out.println("list: " + list);

        // remove() -> remove the specified element from the collection
        list.remove(4);
        System.out.println("Remove the specified element from list: " + list);

        System.out.println("--------------------------------------------------------------");

        // addAll() -> adds all the elements of specified Collection to the Collection
        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("List2: " + list2);

        list.addAll(list2);

        System.out.println("Add all the elements of list2 to list: " + list);

        // removeAll() -> remove all the elements of specified Collection from the Collection
        list.removeAll(list2);
        System.out.println("Remove the elements of list2 from list: " + list);

        // size() -> returns the size of the list (Collection)
        System.out.println("Size of list: " + list.size());

        // clear() -> removes all the elements of the COllection (list)
        System.out.println("List2 before: " + list2);
        list2.clear();
        System.out.println("List2 after: " + list2);
        System.out.println("size of List2: " + list2.size());

        System.out.println("--------------------------------------------------------");

        // iterator() -> returns iterator object that can be used to sequentially access the elements of lists
        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        // iterator an a method called hasNext().
        // hasNext() -> agar list me aage element present hai toh 'True' return krta hai aur next element pe move kar jata hai
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        System.out.println("----------------------------------------------------------");

        List<Integer> list3 = new ArrayList<>();

        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println("List3: " + list3);

        // get() -> helps to randomly access elements from list
        System.out.println("get() method used: " + list3.get(2));  // it take index no.

        // set() ->
        list3.set(1, 13);
        System.out.println("list3 after set method: " + list3);

        // toArray() -> Converts a list into an array
        Object[] arr  = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains() -> return true if a list contains specific element
        System.out.println("contains method: " + list3.contains(14));

        System.out.println("---------------------------------------------");

        list.add(60);
        System.out.println("updated list: " + list);

        // sort() -> sort an ArrayList
        Collections.sort(list);  // ascending order
        System.out.println("sorted list in ascending order: " + list);

        Collections.sort(list.reversed());
//        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorted list in descending order: " + list);

        // clone() -> creates a new arrayList with the same element, size and capacity
        // clone() method do shallow copy only (Shallow copy copies the references.)

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println("New List: " + newList);

        // ensureCapacity() -> Specifies the total element the arrayList can contain
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty() -> checks if the arrayList is empty
        System.out.println(newList.isEmpty());
        System.out.println(marks.isEmpty());

        


    }

}

package CollectionFramework.List;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(18);
        list.add(45);
        list.add(17);
        list.add(22);
        list.add(88);
        list.add(25);
        list.add(18);
        list.add(29);
        list.add(24);
        list.add(18);
        System.out.println("list: " + list);

        // remove() -> remove the specified element from the collection
        list.remove(4);
        System.out.println("Remove the specified element from list: " + list);

        System.out.println("--------------------------------------------------------------");

        // addAll() -> adds all the elements of specified Collection to the Collection
        LinkedList<Integer> list2 = new LinkedList<>();

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

        // sort() -> sort an LinkedList
        Collections.sort(list);  // ascending order
        System.out.println("sorted list in ascending order: " + list);

        Collections.sort(list.reversed());
//        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sorted list in descending order: " + list);

        // clone() -> creates a new arrayList with the same element, size and capacity
        // clone() method do shallow copy only (Shallow copy copies the references.)
        // clone() method is not possible to use inside the LinkedList
//        LinkedList<Integer> newList = (LinkedList<Integer>) list.clone();
//        System.out.println("New List: " + newList);

        // ensureCapacity() -> Specifies the total element the LinkedList can contain
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        // isEmpty() -> checks if the arrayList is empty
//        System.out.println("is newlist is empty: "+ newList.isEmpty());
        System.out.println("is marks is empty: " + marks.isEmpty());

        // indexOf() -> Searches a specified element in an arraylist and returns the index of the element
        System.out.println(list);
        System.out.println("indexOf: " + list.indexOf(18));

        // lastIndexOf() -> returns the index of the last occurrence of the element
        System.out.println("lastIndexOf(): " + list.lastIndexOf(18));

        list.remove(0);
        list.remove(2);
        list.remove(6);
        list.remove(1);
        list.remove(5);
        list.remove(4);
        System.out.println(list);

        System.out.println("------------------------- LinkedList as Queue and Deque (METHODS) -----------------------");

        // addFirst() -> adds specified element at the beginning of the LinkedList
        list.addFirst(45);
        System.out.println("addFirst(): " + list);

        // addLast() -> adds specified element at the end of the LinkedList
        list.addLast(17);
        System.out.println("addLast(): " + list);

        // removeFirst() -> removes the first element
        list.removeFirst();
        System.out.println("removeFirst(): " + list);

        // removeLast() -> removes the last element
        list.removeLast();
        System.out.println("removeLast(): " + list);

        // getFirst() -> returns the first element
        System.out.println("getFirst(): " + list.getFirst());

        // getLast() -> returns the last element
        System.out.println("getLast(): " + list.getLast());

        // peek() -> returns the first element (head) of the LinkedList
        list.peek();
        System.out.println("peek(): " + list);

        // poll() -> returns and removes the first element from the LinkedList
        System.out.println("before poll(): " + list);
        System.out.println("polling: " + list.poll());
        System.out.println("after poll(): " + list);

        // offer() -> adds the specified element at the end of the LinkedList
        list.offer(100);
        System.out.println("offer(): " + list);
    }
}

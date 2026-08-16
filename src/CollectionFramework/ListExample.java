package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
        System.out.println("Add the specified element to the list: " + list);

        // remove() -> remove the specified element from the collection
        list.remove(4);
        System.out.println("Remove the specified element from list: " + list);

        // addAll() -> adds all the elements of specified Collection to the Collection
        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println("Add the specified elements to List2: " + list2);

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

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        // iterator an a method called hasNext().
        // hasNext() -> agar list me aage element present hai toh 'True' return krta hai aur next element pe move kar jata hai
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

    }
}

package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
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
        System.out.println(list);

        // remove() -> remove the specified element from the collection
        list.remove(4);
        System.out.println(list);

        // addAll() -> adds all the elements of specified Collection to the Collection
        List<Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        System.out.println(list2);

        list.addAll(list2);

        System.out.println(list);

        // removeAll() -> remove all the elements of specified Collection from the Collection
        list.removeAll(list2);
        System.out.println(list);
    }
}

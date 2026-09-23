package CollectionFramework.ComparatorEx;

import java.util.Comparator;

public class ArraysExComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return 0 - Integer.compare(o1, o2);
//        return Integer.compare(o2 , o1);
    }
}

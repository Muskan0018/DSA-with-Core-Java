package CollectionFramework.ComparatorEx;

import java.util.Comparator;

public class WeightComaparator implements Comparator<StudentCom> {

    // we can use this for multiple sorting

    @Override
    public int compare(StudentCom o1, StudentCom o2) {
//        return o1.weight - o2.weight;
        return Integer.compare(o1.weight, o2.weight);
    }
}

package Collection;
import java.util.*;

public class SetEx {
    public static void main(String[] args) {
       
        Set<Integer> intSet = new TreeSet<>();  // it will store elements in sorted order
        intSet.add(45);
        intSet.add(18);
        intSet.add(99);
        // System.out.println("Integer Set (sorted): " + intSet);

         Set<String> set = new HashSet<>(); // it will store elements in no particular order 
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate, will not be added


        // for (String lang : set) {
        //     System.out.println(lang);
        // }

        // System.out.println("Set contents: " + set);

        // set.remove("Python");
        // System.out.println("After removing Python: " + set);

        // System.out.println("Set contains Java: " + set.contains("Java"));
        // System.out.println("Set size: " + set.size());

        // set.clear();
        // System.out.println("Set cleared. Is empty: " + set.isEmpty()); 

        Iterator<Integer> values  = intSet.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}

package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
   public static void main(String[] args) {

       Set<Integer> st = new HashSet<>();

       st.add(10);
       st.add(20);
       st.add(10);
       st.add(30);
       st.add(10);


       System.out.println("HashSet: " + st);
    }
}

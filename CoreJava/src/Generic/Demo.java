package Generic;

import java.util.*;
public class Demo {
    public static void main(String[] args) {
/*    Generic:  <> isme pehle hi type declare kra jata h
it provide type safety
*/
        List<String> list = new ArrayList<>();
        list.add("Ironman");

        List list2 = new ArrayList();    // non-Generic (add any type)
        list2.add("Thor");
        list2.add(20);

        System.out.println("Generic: " + list);
        System.out.println("Non-Generic: " + list2);
    }
}

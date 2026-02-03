package Collection;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

//        HASHMAP

        HashMap<String, Integer> courses = new HashMap<>();

        // adding elements
        courses.put("Core Java", 5000);
        courses.put("Basic Python", 3000);
        courses.put("Spring", 8000);
        courses.put("Andriod", 6000); // duplicate Keys ar not allowed
        courses.put("DSA", 100000);

        System.out.println(courses);

//        courses.forEach((e1,e2) -> {
//            System.out.println(e1 + " => " + e2);
//        });

        courses.forEach((key,value) -> {
            System.out.print(key);
            System.out.print(" => ");
            System.out.println(value);
            System.out.println();
        });

        System.out.println(courses.get("Core Java"));
    }
}
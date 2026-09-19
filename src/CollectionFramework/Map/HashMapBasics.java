package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * =========================================================
 * PART 1: LinkedHashSet
 * =========================================================
 *
 * Elements are stored in Key-Value pairs
 * 
 */

public class HashMapBasics {
    public static void main(String[] args) {

        Map<String, String> mapping = new HashMap<>();

        // insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");
        System.out.println("Map: " + mapping);
    }
}


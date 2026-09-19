package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

/*
 * =========================================================
 * PART 1: HashMap
 * =========================================================
 *
 * Elements are stored in Key-Value pairs
 * Keys are unique
 * Value can be duplicate
 * No duplicate key for each value
 *
 * Map allow NULL values
 * HashMap allows one NULL key & multiple NULL values
 * Hashtable does not allow NULL keys or values
 */

public class HashMapBasics {
    public static void main(String[] args) {

        Map<String, String> mapping = new HashMap<>();

    /* For Insertion
    *
     */
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");
        System.out.println("Map: " + mapping);
    }
}


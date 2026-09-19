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
    * put(K,V)- Insert the association of a key K and a value V into the Map
    * If key is already present, the new value replaces the old value
    */
        mapping.put("in", "India1");
        mapping.put("en", "England");
        mapping.put("us", "United States");
        mapping.put("nz", "NewZeland");
        mapping.put("in", "India");    // If key is already present, the new value replaces the old value
        System.out.println("Map1: " + mapping);

        Map<String, String> county = new HashMap<>();

        county.put("br", "Brazil");
        System.out.println("Before: " + county);

    // putAll() -Inserts all the entries from Specific Map to this Map
        
        county.putAll(mapping);
        System.out.println("Afer putAll(): " + county);

    }
}


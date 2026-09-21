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
        mapping.put("nz", "NewZealand");
        mapping.put("in", "India");    // If key is already present, the new value replaces the old value
        System.out.println("Map1: " + mapping);

        Map<String, String> country = new HashMap<>();

        country.put("br", "Brazil");
        System.out.println("Before: " + country);

    // putAll() - Inserts all the entries from Specific Map to this Map

        country.putAll(mapping);
        System.out.println("Afer putAll(): " + country);

    // remove
        country.remove("us");
        System.out.println("Remove: " + country);

    // putIfAbsent(K, V)- Insert the association if the key K is not already associated with the value V.
        country.putIfAbsent("us", "United States");
        System.out.println("putIfAbsent: " + country);

        country.putIfAbsent("ind", "India");
        System.out.println("updated: " + country);

    /* get(K) - Returns the value associated with the specified key K.
                If the key is not found, it returns null.
     */
        System.out.println("get(): " + country.get("br"));

    /*  getorDefault(K, defaultValue) - Returns the value associated with the specified key K.
                                        If the key is not found, it returns the defaultValue.
     */
        System.out.println("Defualt: " + country.getOrDefault("un", "United Nation"));

    // containsKey(K) - Check it the specified key k is present in the map or not.
        System.out.println("Key Contains: " + country.containsKey("in"));

    // containsValue(V) -  Check it the specified value V is present in the map or not.
        System.out.println("Value Contains: " + country.containsValue("NewZealand"));
    }
}


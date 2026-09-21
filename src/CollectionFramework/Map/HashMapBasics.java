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
        mapping.put("aus", "Australia");
        mapping.put("jap", "Japan");
        mapping.put("nep", "Nepal");
        mapping.put("afg", "Afganistan");
        mapping.put("en", "England");
        mapping.put("us", "United State");
        mapping.put("nz", "NewZealand");
        mapping.put("in", "India");    // If key is already present, the new value replaces the old value
        System.out.println("Map1: " + mapping);

        System.out.println("--------------------------------------------------------------------------");

        Map<String, String> country = new HashMap<>();

        country.put("br", "Brazil");
        System.out.println("Before: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // putAll() - Inserts all the entries from Specific Map to this Map

        country.putAll(mapping);
        System.out.println("Afer putAll(): " + country);

        System.out.println("--------------------------------------------------------------------------");

    // remove
        country.remove("us");
        System.out.println("Remove: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // putIfAbsent(K, V)- Insert the association if the key K is not already associated with the value V.
        country.putIfAbsent("us", "United States");
        System.out.println("putIfAbsent: " + country);

        country.putIfAbsent("ind", "India");
        System.out.println("updated: " + country);

        System.out.println("--------------------------------------------------------------------------");

    /* get(K) - Returns the value associated with the specified key K.
                If the key is not found, it returns null.
     */
        System.out.println("get(): " + country.get("br"));

        System.out.println("--------------------------------------------------------------------------");

    /*  getorDefault(K, defaultValue) - Returns the value associated with the specified key K.
                                        If the key is not found, it returns the defaultValue.
     */
        System.out.println("Defualt: " + country.getOrDefault("un", "United Nation"));

        System.out.println("--------------------------------------------------------------------------");

    // containsKey(K) - Check it the specified key k is present in the map or not.
        System.out.println("Key Contains: " + country.containsKey("in"));

        System.out.println("--------------------------------------------------------------------------");

    // containsValue(V) -  Check it the specified value V is present in the map or not.
        System.out.println("Value Contains: " + country.containsValue("NewZealand"));

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("Map: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // replace(K,V) - Replace the value of the Key K with the new specified value V.
        country.replace("ind", "Idonesia");
        System.out.println("Replace value of the key: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // replace(K, oldValue, newValue) - Replaces the oldValue of the key K with the newValue.
        country.replace("us", "United States", "United States of America");
        System.out.println("Replace the old val with new val: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // remove(K) - Removes the entry from the map represented by the Key K.
        country.remove("ind");
        System.out.println("Remove: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // remove(K, V) - Removes the enty from the map that has key K associated with the value V.
        country.remove("afg", "Afganistan");
        System.out.println("Remove from key & Value: " + country);

        System.out.println("--------------------------------------------------------------------------");

    // keySet() - Returns a set of all the Keys present in a map.
        System.out.println("All Keys: " + country.keySet());

        System.out.println("--------------------------------------------------------------------------");

    // values() - Returns a set of all the Values present in a map.
        System.out.println("All Value: " + country.values());

        System.out.println("--------------------------------------------------------------------------");

    // entrySet() - Returns a set of all the Key/Value mapping present in a map.
        System.out.println("All Keys & Values: " + country.entrySet());

        System.out.println("---------------------------------------- Methods Completed ----------------------------------");
    }
}


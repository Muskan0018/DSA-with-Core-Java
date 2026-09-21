package CollectionFramework.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasics {
    public static void main(String[] args) {

            // ============================================================
            // 1. CREATING A LinkedHashMap
            // ============================================================

            // Syntax:
            // LinkedHashMap<KeyType, ValueType> map = new LinkedHashMap<>();

            LinkedHashMap<Integer, String> students = new LinkedHashMap<>();


            // ============================================================
            // 2. put()
            // ============================================================
            // Adds a key-value pair to the map.
            //
            // If the key already exists, its old value is replaced.

            students.put(101, "Rahul");
            students.put(102, "Aman");
            students.put(103, "Priya");
            students.put(104, "Neha");

            System.out.println("After put(): " + students);


            // ============================================================
            // 3. get()
            // ============================================================
            // Returns the value associated with the given key.
            //
            // If the key does not exist, it returns null.

            String name = students.get(102);

            System.out.println("Value of key 102: " + name);


            // ============================================================
            // 4. getOrDefault()
            // ============================================================
            // Returns the value for the given key.
            // If the key does not exist, it returns the specified default value.

            System.out.println(
                    "Value of key 105: " + students.getOrDefault(105, "Not Found")
            );


            // ============================================================
            // 5. containsKey()
            // ============================================================
            // Checks whether a particular key exists.

            System.out.println(
                    "Does key 103 exist? " + students.containsKey(103)
            );


            // ============================================================
            // 6. containsValue()
            // ============================================================
            // Checks whether a particular value exists.

            System.out.println(
                    "Does value 'Priya' exist? " + students.containsValue("Priya")
            );


            // ============================================================
            // 7. remove()
            // ============================================================
            // Removes the key-value pair associated with the given key.

            students.remove(104);

            System.out.println("After remove(104): " + students);


            // ============================================================
            // 8. remove(key, value)
            // ============================================================
            // Removes the entry only if both key AND value match.

            students.remove(103, "Priya");

            System.out.println(
                    "After remove(103, \"Priya\"): " + students
            );


            // ============================================================
            // 9. putIfAbsent()
            // ============================================================
            // Adds the key-value pair only if the key does not already exist.

            students.putIfAbsent(105, "Karan");

            // Key 102 already exists, so its value will NOT be changed.
            students.putIfAbsent(102, "New Aman");

            System.out.println("After putIfAbsent(): " + students);


            // ============================================================
            // 10. replace()
            // ============================================================
            // Replaces the value associated with an existing key.

            students.replace(105, "Arjun");

            System.out.println("After replace(): " + students);


            // ============================================================
            // 11. replace(key, oldValue, newValue)
            // ============================================================
            // Replaces the value only if the old value matches.

            students.replace(102, "Aman", "Rohit");

            System.out.println(
                    "After conditional replace(): " + students
            );


            // ============================================================
            // 12. size()
            // ============================================================
            // Returns the number of key-value pairs.

            System.out.println("Size: " + students.size());


            // ============================================================
            // 13. isEmpty()
            // ============================================================
            // Checks whether the map contains no elements.

            System.out.println("Is map empty? " + students.isEmpty());


            // ============================================================
            // 14. keySet()
            // ============================================================
            // Returns a Set containing all keys.

            System.out.println("Keys: " + students.keySet());


            // ============================================================
            // 15. values()
            // ============================================================
            // Returns a Collection containing all values.

            System.out.println("Values: " + students.values());


            // ============================================================
            // 16. entrySet()
            // ============================================================
            // Returns a Set containing all key-value pairs.
            //
            // This is commonly used when iterating through a Map.

            System.out.println("Entries: " + students.entrySet());


            // ============================================================
            // 17. Iterating using keySet()
            // ============================================================

            System.out.println("\nUsing keySet():");

            for (Integer key : students.keySet()) {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + students.get(key)
                );
            }


            // ============================================================
            // 18. Iterating using entrySet()
            // ============================================================
            // This is generally preferred when both key and value are needed.

            System.out.println("\nUsing entrySet():");

            for (Map.Entry<Integer, String> entry : students.entrySet()) {

                System.out.println(
                        "Key = " + entry.getKey() +
                                ", Value = " + entry.getValue()
                );
            }


            // ============================================================
            // 19. forEach()
            // ============================================================
            // Java 8+ allows us to iterate using a lambda expression.

            System.out.println("\nUsing forEach():");

            students.forEach((key, value) -> {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + value
                );
            });


            // ============================================================
            // 20. clear()
            // ============================================================
            // Removes all key-value pairs from the map.

            students.clear();

            System.out.println("\nAfter clear(): " + students);

            System.out.println(
                    "Is map empty now? " + students.isEmpty()
            );
        }
}

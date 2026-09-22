package CollectionFramework.Map;

import java.util.Map;
import java.util.WeakHashMap;


public class WeakHashMapBasics {

        public static void main(String[] args) {

            // ============================================================
            // 1. CREATING A WeakHashMap
            // ============================================================

            // Syntax:
            //
            // WeakHashMap<KeyType, ValueType> map =
            //         new WeakHashMap<>();

            WeakHashMap<String, String> map =
                    new WeakHashMap<>();


            // ============================================================
            // 2. put()
            // ============================================================
            // Adds a key-value pair to the WeakHashMap.
            //
            // IMPORTANT:
            // Keys in WeakHashMap are stored using weak references.

            map.put("Java", "Programming Language");
            map.put("SQL", "Database Language");
            map.put("Python", "Programming Language");
            map.put("HTML", "Markup Language");

            System.out.println("After put():");
            System.out.println(map);


            // ============================================================
            // 3. get()
            // ============================================================
            // Returns the value associated with the specified key.
            //
            // Returns null if the key doesn't exist.

            String value = map.get("Java");

            System.out.println(
                    "\nValue of Java: " + value
            );


            // ============================================================
            // 4. getOrDefault()
            // ============================================================
            // Returns the value associated with the key.
            //
            // If the key doesn't exist, returns the specified
            // default value.

            System.out.println(
                    "Value of C++: " +
                            map.getOrDefault(
                                    "C++",
                                    "Not Found"
                            )
            );


            // ============================================================
            // 5. containsKey()
            // ============================================================
            // Checks whether a particular key exists.

            System.out.println(
                    "\nDoes Java exist? " +
                            map.containsKey("Java")
            );


            // ============================================================
            // 6. containsValue()
            // ============================================================
            // Checks whether a particular value exists.

            System.out.println(
                    "Does 'Database Language' exist? " +
                            map.containsValue(
                                    "Database Language"
                            )
            );


            // ============================================================
            // 7. remove(key)
            // ============================================================
            // Removes the entry associated with the specified key.

            map.remove("HTML");

            System.out.println(
                    "\nAfter remove(\"HTML\"):"
            );

            System.out.println(map);


            // ============================================================
            // 8. remove(key, value)
            // ============================================================
            // Removes the entry only when BOTH key and value match.

            map.remove(
                    "SQL",
                    "Database Language"
            );

            System.out.println(
                    "\nAfter remove(\"SQL\", \"Database Language\"):"
            );

            System.out.println(map);


            // ============================================================
            // 9. putIfAbsent()
            // ============================================================
            // Adds the key-value pair only if the key
            // does not already exist.

            map.putIfAbsent(
                    "JavaScript",
                    "Scripting Language"
            );

            // Java already exists, so its value will NOT
            // be replaced by the following statement.

            map.putIfAbsent(
                    "Java",
                    "New Value"
            );

            System.out.println(
                    "\nAfter putIfAbsent():"
            );

            System.out.println(map);


            // ============================================================
            // 10. replace(key, value)
            // ============================================================
            // Replaces the existing value associated with a key.

            map.replace(
                    "Java",
                    "Object-Oriented Programming Language"
            );

            System.out.println(
                    "\nAfter replace():"
            );

            System.out.println(map);


            // ============================================================
            // 11. replace(key, oldValue, newValue)
            // ============================================================
            // Replaces the value only if the old value matches.

            map.replace(
                    "Python",
                    "Programming Language",
                    "High-Level Programming Language"
            );

            System.out.println(
                    "\nAfter conditional replace():"
            );

            System.out.println(map);


            // ============================================================
            // 12. size()
            // ============================================================
            // Returns the number of entries currently in the map.

            System.out.println(
                    "\nSize: " + map.size()
            );


            // ============================================================
            // 13. isEmpty()
            // ============================================================
            // Returns true if the map contains no entries.

            System.out.println(
                    "Is map empty? " + map.isEmpty()
            );


            // ============================================================
            // 14. keySet()
            // ============================================================
            // Returns a Set containing all keys.

            System.out.println(
                    "\nKeys: " + map.keySet()
            );


            // ============================================================
            // 15. values()
            // ============================================================
            // Returns a Collection containing all values.

            System.out.println(
                    "Values: " + map.values()
            );


            // ============================================================
            // 16. entrySet()
            // ============================================================
            // Returns a Set containing all key-value pairs.

            System.out.println(
                    "Entries: " + map.entrySet()
            );


            // ============================================================
            // 17. Iterating using keySet()
            // ============================================================
            // Useful when you need the keys.

            System.out.println(
                    "\nUsing keySet():"
            );

            for (String key : map.keySet()) {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + map.get(key)
                );
            }


            // ============================================================
            // 18. Iterating using entrySet()
            // ============================================================
            // Recommended when you need BOTH key and value.

            System.out.println(
                    "\nUsing entrySet():"
            );

            for (Map.Entry<String, String> entry
                    : map.entrySet()) {

                System.out.println(
                        "Key = " + entry.getKey() +
                                ", Value = " + entry.getValue()
                );
            }


            // ============================================================
            // 19. forEach()
            // ============================================================
            // Java 8+ lambda-based iteration.

            System.out.println(
                    "\nUsing forEach():"
            );

            map.forEach((key, val) -> {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + val
                );
            });


            // ============================================================
            // 20. replaceAll()
            // ============================================================
            // Replaces the value of EVERY entry.

            map.replaceAll(
                    (key, val) ->
                            val + " [Updated]"
            );

            System.out.println(
                    "\nAfter replaceAll():"
            );

            System.out.println(map);


            // ============================================================
            // 21. merge()
            // ============================================================
            // If the key doesn't exist:
            //     Adds the key-value pair.
            //
            // If the key exists:
            //     Combines the old and new values.

            map.merge(
                    "Java",
                    " + JVM",
                    (oldValue, newValue) ->
                            oldValue + newValue
            );

            System.out.println(
                    "\nAfter merge():"
            );

            System.out.println(map);


            // ============================================================
            // 22. computeIfAbsent()
            // ============================================================
            // Calculates a value only if the key is absent.

            map.computeIfAbsent(
                    "C++",
                    key -> "Programming Language"
            );

            System.out.println(
                    "\nAfter computeIfAbsent():"
            );

            System.out.println(map);


            // ============================================================
            // 23. computeIfPresent()
            // ============================================================
            // Calculates a new value only if the key exists.

            map.computeIfPresent(
                    "Java",
                    (key, oldValue) ->
                            oldValue + " [Modified]"
            );

            System.out.println(
                    "\nAfter computeIfPresent():"
            );

            System.out.println(map);


            // ============================================================
            // 24. compute()
            // ============================================================
            // Recalculates the value for a key.
            //
            // The function receives:
            //     key
            //     current value

            map.compute(
                    "Python",
                    (key, oldValue) ->
                            oldValue + " [Computed]"
            );

            System.out.println(
                    "\nAfter compute():"
            );

            System.out.println(map);


            // ============================================================
            // 25. clear()
            // ============================================================
            // Removes ALL entries from the WeakHashMap.

            map.clear();

            System.out.println(
                    "\nAfter clear():"
            );

            System.out.println(map);

            System.out.println(
                    "Is map empty now? " +
                            map.isEmpty()
            );
        }
}

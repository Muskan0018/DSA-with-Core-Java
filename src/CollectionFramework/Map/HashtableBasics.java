package CollectionFramework.Map;

import java.util.Hashtable;
import java.util.Map;

//Hashtable is an older, legacy map implementation.

public class HashtableBasics {

        public static void main(String[] args) {

            // ============================================================
            // 1. CREATING A HASHTABLE
            // ============================================================

            // Syntax:
            //
            // Hashtable<KeyType, ValueType> table =
            //         new Hashtable<>();

            Hashtable<Integer, String> students =
                    new Hashtable<>();


            // ============================================================
            // 2. put()
            // ============================================================
            // Adds a key-value pair.
            //
            // If the key already exists, its old value is replaced.
            //
            // IMPORTANT:
            // Hashtable does NOT allow null keys or null values.

            students.put(101, "Rahul");
            students.put(102, "Aman");
            students.put(103, "Priya");
            students.put(104, "Neha");

            System.out.println("After put():");
            System.out.println(students);


            // ============================================================
            // 3. get()
            // ============================================================
            // Returns the value associated with the specified key.
            //
            // If the key doesn't exist, returns null.

            String name = students.get(102);

            System.out.println(
                    "\nValue of key 102: " + name
            );


            // ============================================================
            // 4. getOrDefault()
            // ============================================================
            // Returns the value associated with the key.
            //
            // If the key doesn't exist, returns the specified
            // default value.

            System.out.println(
                    "Value of key 999: " +
                            students.getOrDefault(
                                    999,
                                    "Not Found"
                            )
            );


            // ============================================================
            // 5. containsKey()
            // ============================================================
            // Checks whether a particular key exists.

            System.out.println(
                    "\nDoes key 103 exist? " +
                            students.containsKey(103)
            );


            // ============================================================
            // 6. containsValue()
            // ============================================================
            // Checks whether a particular value exists.

            System.out.println(
                    "Does value 'Priya' exist? " +
                            students.containsValue("Priya")
            );


            // ============================================================
            // 7. contains()
            // ============================================================
            // Legacy method.
            //
            // Checks whether a particular VALUE exists.
            //
            // It is equivalent to containsValue().
            //
            // This method exists for compatibility with older Java code.
            // Prefer containsValue() in new code.

            System.out.println(
                    "Does value 'Aman' exist? " +
                            students.contains("Aman")
            );


            // ============================================================
            // 8. remove(key)
            // ============================================================
            // Removes the entry associated with the specified key.

            students.remove(104);

            System.out.println(
                    "\nAfter remove(104):"
            );

            System.out.println(students);


            // ============================================================
            // 9. remove(key, value)
            // ============================================================
            // Removes the entry only if BOTH the key and value match.

            students.remove(103, "Priya");

            System.out.println(
                    "\nAfter remove(103, \"Priya\"):"
            );

            System.out.println(students);


            // ============================================================
            // 10. putIfAbsent()
            // ============================================================
            // Adds the key-value pair only if the key
            // does NOT already exist.

            students.putIfAbsent(105, "Karan");

            // Key 101 already exists.
            // Therefore, "New Rahul" will NOT replace "Rahul".

            students.putIfAbsent(101, "New Rahul");

            System.out.println(
                    "\nAfter putIfAbsent():"
            );

            System.out.println(students);


            // ============================================================
            // 11. replace(key, value)
            // ============================================================
            // Replaces the existing value for a key.

            students.replace(
                    105,
                    "Arjun"
            );

            System.out.println(
                    "\nAfter replace():"
            );

            System.out.println(students);


            // ============================================================
            // 12. replace(key, oldValue, newValue)
            // ============================================================
            // Replaces the value only if the old value matches.

            students.replace(
                    102,
                    "Aman",
                    "Rohit"
            );

            System.out.println(
                    "\nAfter conditional replace():"
            );

            System.out.println(students);


            // ============================================================
            // 13. size()
            // ============================================================
            // Returns the number of key-value pairs.

            System.out.println(
                    "\nSize: " + students.size()
            );


            // ============================================================
            // 14. isEmpty()
            // ============================================================
            // Returns true if the Hashtable contains no entries.

            System.out.println(
                    "Is Hashtable empty? " +
                            students.isEmpty()
            );


            // ============================================================
            // 15. keySet()
            // ============================================================
            // Returns a Set containing all keys.

            System.out.println(
                    "\nKeys: " +
                            students.keySet()
            );


            // ============================================================
            // 16. values()
            // ============================================================
            // Returns a Collection containing all values.

            System.out.println(
                    "Values: " +
                            students.values()
            );


            // ============================================================
            // 17. entrySet()
            // ============================================================
            // Returns a Set containing all key-value pairs.

            System.out.println(
                    "Entries: " +
                            students.entrySet()
            );


            // ============================================================
            // 18. Iterating using keySet()
            // ============================================================
            // Useful when you mainly need the keys.

            System.out.println(
                    "\nUsing keySet():"
            );

            for (Integer key : students.keySet()) {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + students.get(key)
                );
            }


            // ============================================================
            // 19. Iterating using entrySet()
            // ============================================================
            // Preferred when you need BOTH key and value.

            System.out.println(
                    "\nUsing entrySet():"
            );

            for (Map.Entry<Integer, String> entry
                    : students.entrySet()) {

                System.out.println(
                        "Key = " + entry.getKey() +
                                ", Value = " + entry.getValue()
                );
            }


            // ============================================================
            // 20. forEach()
            // ============================================================
            // Java 8+ lambda-based iteration.

            System.out.println(
                    "\nUsing forEach():"
            );

            students.forEach((key, value) -> {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + value
                );
            });


            // ============================================================
            // 21. replaceAll()
            // ============================================================
            // Replaces the value of EVERY entry.
            //
            // Here we add " Student" to every name.

            students.replaceAll(
                    (key, value) ->
                            value + " Student"
            );

            System.out.println(
                    "\nAfter replaceAll():"
            );

            System.out.println(students);


            // ============================================================
            // 22. merge()
            // ============================================================
            // If the key doesn't exist:
            //     Adds the key-value pair.
            //
            // If the key already exists:
            //     Combines old and new values using the function.

            students.merge(
                    101,
                    " + Java",
                    (oldValue, newValue) ->
                            oldValue + newValue
            );

            System.out.println(
                    "\nAfter merge():"
            );

            System.out.println(students);


            // ============================================================
            // 23. computeIfAbsent()
            // ============================================================
            // Calculates a value only if the key is absent.

            students.computeIfAbsent(
                    106,
                    key -> "Sahil"
            );

            System.out.println(
                    "\nAfter computeIfAbsent():"
            );

            System.out.println(students);


            // ============================================================
            // 24. computeIfPresent()
            // ============================================================
            // Calculates a new value only if the key is present.

            students.computeIfPresent(
                    102,
                    (key, oldValue) ->
                            oldValue + " [Updated]"
            );

            System.out.println(
                    "\nAfter computeIfPresent():"
            );

            System.out.println(students);


            // ============================================================
            // 25. compute()
            // ============================================================
            // Recalculates the value associated with a key.
            //
            // The function receives:
            //     key
            //     current value

            students.compute(
                    103,
                    (key, oldValue) ->
                            oldValue == null
                                    ? "New Student"
                                    : oldValue + " [Computed]"
            );

            System.out.println(
                    "\nAfter compute():"
            );

            System.out.println(students);


            // ============================================================
            // 26. elements()
            // ============================================================
            // LEGACY Hashtable method.
            //
            // Returns an Enumeration of all values.

            System.out.println(
                    "\nUsing elements():"
            );

            var values = students.elements();

            while (values.hasMoreElements()) {

                System.out.println(
                        values.nextElement()
                );
            }


            // ============================================================
            // 27. keys()
            // ============================================================
            // LEGACY Hashtable method.
            //
            // Returns an Enumeration of all keys.

            System.out.println(
                    "\nUsing keys():"
            );

            var keys = students.keys();

            while (keys.hasMoreElements()) {

                System.out.println(
                        keys.nextElement()
                );
            }


            // ============================================================
            // 28. clone()
            // ============================================================
            // Creates a shallow copy of the Hashtable.

            Hashtable<Integer, String> copy =
                    (Hashtable<Integer, String>) students.clone();

            System.out.println(
                    "\nCloned Hashtable:"
            );

            System.out.println(copy);


            // ============================================================
            // 29. clear()
            // ============================================================
            // Removes ALL key-value pairs.

            students.clear();

            System.out.println(
                    "\nAfter clear():"
            );

            System.out.println(students);

            System.out.println(
                    "Is Hashtable empty now? " +
                            students.isEmpty()
            );
        }
}

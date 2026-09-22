package CollectionFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {
    public static void main(String[] args) {

            // ============================================================
            // 1. CREATING A TreeMap
            // ============================================================

            // TreeMap stores data in KEY-VALUE pairs.
            //
            // Syntax:
            // TreeMap<KeyType, ValueType> map = new TreeMap<>();

            TreeMap<Integer, String> students = new TreeMap<>();


            // ============================================================
            // 2. put()
            // ============================================================
            // Adds a key-value pair.
            //
            // TreeMap automatically sorts the keys in ascending order.

            students.put(103, "Virat");
            students.put(101, "Rahul");
            students.put(105, "Rohit");
            students.put(102, "Bhuvi");
            students.put(104, "Rajat");

            System.out.println("After put(): " + students);

            // Output:
            // {101=Rahul, 102=Aman, 103=Priya, 104=Neha, 105=Karan}


            // ============================================================
            // 3. get()
            // ============================================================
            // Returns the value associated with the specified key.
            //
            // If the key doesn't exist, it returns null.

            String name = students.get(102);

            System.out.println("Value of key 102: " + name);


            // ============================================================
            // 4. getOrDefault()
            // ============================================================
            // Returns the value associated with the key.
            // If the key doesn't exist, returns the default value.

            System.out.println(
                    "Value of key 999: " +
                            students.getOrDefault(999, "Not Found")
            );


            // ============================================================
            // 5. containsKey()
            // ============================================================
            // Checks whether a particular key exists.

            System.out.println(
                    "Does key 103 exist? " +
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
            // 7. remove(key)
            // ============================================================
            // Removes the entry associated with the specified key.

            students.remove(105);

            System.out.println(
                    "After remove(105): " + students
            );


            // ============================================================
            // 8. remove(key, value)
            // ============================================================
            // Removes the entry only if BOTH key and value match.

            students.remove(104, "Neha");

            System.out.println(
                    "After remove(104, \"Neha\"): " + students
            );


            // ============================================================
            // 9. putIfAbsent()
            // ============================================================
            // Adds the key-value pair only if the key is not already present.

            students.putIfAbsent(105, "Karan");

            // Key 101 already exists.
            // Therefore, "New Rahul" will NOT replace "Rahul".

            students.putIfAbsent(101, "New Rahul");

            System.out.println(
                    "After putIfAbsent(): " + students
            );


            // ============================================================
            // 10. replace()
            // ============================================================
            // Replaces the value associated with an existing key.

            students.replace(105, "Arjun");

            System.out.println(
                    "After replace(): " + students
            );


            // ============================================================
            // 11. replace(key, oldValue, newValue)
            // ============================================================
            // Replaces the value only when the old value matches.

            students.replace(102, "Aman", "Rohit");

            System.out.println(
                    "After conditional replace(): " + students
            );


            // ============================================================
            // 12. size()
            // ============================================================
            // Returns the number of key-value pairs.

            System.out.println(
                    "Size: " + students.size()
            );


            // ============================================================
            // 13. isEmpty()
            // ============================================================
            // Returns true if the TreeMap contains no entries.

            System.out.println(
                    "Is map empty? " + students.isEmpty()
            );


            // ============================================================
            // 14. firstKey()
            // ============================================================
            // Returns the SMALLEST key.

            System.out.println(
                    "First key: " + students.firstKey()
            );


            // ============================================================
            // 15. lastKey()
            // ============================================================
            // Returns the LARGEST key.

            System.out.println(
                    "Last key: " + students.lastKey()
            );


            // ============================================================
            // 16. firstEntry()
            // ============================================================
            // Returns the entry having the smallest key.

            System.out.println(
                    "First entry: " + students.firstEntry()
            );


            // ============================================================
            // 17. lastEntry()
            // ============================================================
            // Returns the entry having the largest key.

            System.out.println(
                    "Last entry: " + students.lastEntry()
            );


            // ============================================================
            // 18. pollFirstEntry()
            // ============================================================
            // Removes and returns the entry having the smallest key.

            Map.Entry<Integer, String> first =
                    students.pollFirstEntry();

            System.out.println(
                    "Removed first entry: " + first
            );

            System.out.println(
                    "After pollFirstEntry(): " + students
            );


            // ============================================================
            // 19. pollLastEntry()
            // ============================================================
            // Removes and returns the entry having the largest key.

            Map.Entry<Integer, String> last =
                    students.pollLastEntry();

            System.out.println(
                    "Removed last entry: " + last
            );

            System.out.println(
                    "After pollLastEntry(): " + students
            );


            // ============================================================
            // 20. lowerKey()
            // ============================================================
            // Returns the greatest key STRICTLY LESS than the given key.

            // Example:
            // If keys are {101, 102, 103, 104}
            // lowerKey(103) = 102

            System.out.println(
                    "lowerKey(103): " + students.lowerKey(103)
            );


            // ============================================================
            // 21. floorKey()
            // ============================================================
            // Returns the greatest key LESS THAN OR EQUAL TO the given key.

            // floorKey(103) = 103 if 103 exists.
            // floorKey(103) = 102 if 103 doesn't exist.

            System.out.println(
                    "floorKey(103): " + students.floorKey(103)
            );


            // ============================================================
            // 22. higherKey()
            // ============================================================
            // Returns the smallest key STRICTLY GREATER than the given key.

            // Example:
            // higherKey(102) = 103

            System.out.println(
                    "higherKey(102): " + students.higherKey(102)
            );


            // ============================================================
            // 23. ceilingKey()
            // ============================================================
            // Returns the smallest key GREATER THAN OR EQUAL to the given key.

            // ceilingKey(102) = 102 if 102 exists.
            // ceilingKey(102) = 103 if 102 doesn't exist.

            System.out.println(
                    "ceilingKey(102): " + students.ceilingKey(102)
            );


            // ============================================================
            // 24. lowerEntry()
            // ============================================================
            // Returns the entry whose key is strictly less
            // than the given key, and is the closest such key.

            System.out.println(
                    "lowerEntry(103): " +
                            students.lowerEntry(103)
            );


            // ============================================================
            // 25. floorEntry()
            // ============================================================
            // Returns the entry whose key is less than or equal
            // to the given key, and is the closest such key.

            System.out.println(
                    "floorEntry(103): " +
                            students.floorEntry(103)
            );


            // ============================================================
            // 26. higherEntry()
            // ============================================================
            // Returns the entry whose key is strictly greater
            // than the given key, and is the closest such key.

            System.out.println(
                    "higherEntry(102): " +
                            students.higherEntry(102)
            );


            // ============================================================
            // 27. ceilingEntry()
            // ============================================================
            // Returns the entry whose key is greater than or equal
            // to the given key, and is the closest such key.

            System.out.println(
                    "ceilingEntry(102): " +
                            students.ceilingEntry(102)
            );


            // ============================================================
            // 28. keySet()
            // ============================================================
            // Returns all keys in sorted order.

            System.out.println(
                    "Keys: " + students.keySet()
            );


            // ============================================================
            // 29. values()
            // ============================================================
            // Returns all values.

            System.out.println(
                    "Values: " + students.values()
            );


            // ============================================================
            // 30. entrySet()
            // ============================================================
            // Returns all key-value pairs.

            System.out.println(
                    "Entries: " + students.entrySet()
            );


            // ============================================================
            // 31. Iterating using keySet()
            // ============================================================
            // Use this when you mainly need the keys.

            System.out.println("\nUsing keySet():");

            for (Integer key : students.keySet()) {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + students.get(key)
                );
            }


            // ============================================================
            // 32. Iterating using entrySet()
            // ============================================================
            // Preferred when you need both key and value.

            System.out.println("\nUsing entrySet():");

            for (Map.Entry<Integer, String> entry
                    : students.entrySet()) {

                System.out.println(
                        "Key = " + entry.getKey() +
                                ", Value = " + entry.getValue()
                );
            }


            // ============================================================
            // 33. forEach()
            // ============================================================
            // Java 8+ lambda-based iteration.

            System.out.println("\nUsing forEach():");

            students.forEach((key, value) -> {

                System.out.println(
                        "Key = " + key +
                                ", Value = " + value
                );
            });


            // ============================================================
            // 34. descendingKeySet()
            // ============================================================
            // Returns keys in DESCENDING order.

            System.out.println(
                    "Descending keys: " +
                            students.descendingKeySet()
            );


            // ============================================================
            // 35. descendingMap()
            // ============================================================
            // Returns a reverse-order view of the TreeMap.

            System.out.println(
                    "Descending map: " +
                            students.descendingMap()
            );


            // ============================================================
            // 36. navigableKeySet()
            // ============================================================
            // Returns a NavigableSet containing all keys.

            System.out.println(
                    "Navigable key set: " +
                            students.navigableKeySet()
            );


            // ============================================================
            // 37. subMap()
            // ============================================================
            // Returns a view of the portion of the map
            // whose keys fall within a specified range.
            //
            // subMap(fromKey, true, toKey, false)
            //
            // true  = include boundary
            // false = exclude boundary

            System.out.println(
                    "SubMap (102 to 104): " +
                            students.subMap(102, true, 104, false)
            );


            // ============================================================
            // 38. headMap()
            // ============================================================
            // Returns entries whose keys are less than the given key.

            System.out.println(
                    "HeadMap (< 104): " +
                            students.headMap(104)
            );


            // ============================================================
            // 39. tailMap()
            // ============================================================
            // Returns entries whose keys are greater than
            // or equal to the given key.

            System.out.println(
                    "TailMap (>= 102): " +
                            students.tailMap(102)
            );


            // ============================================================
            // 40. clear()
            // ============================================================
            // Removes all entries from the TreeMap.

            students.clear();

            System.out.println(
                    "\nAfter clear(): " + students
            );

            System.out.println(
                    "Is map empty? " + students.isEmpty()
            );
        }
}

package CollectionFramework.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapBasics {

        // ================================================================
        // 1. CREATE AN ENUM
        // ================================================================
        // EnumMap can only use an enum type as its KEY.

        enum Day {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }


        public static void main(String[] args) {

            // ============================================================
            // 2. CREATING AN EnumMap
            // ============================================================

            // Syntax:
            //
            // EnumMap<EnumType, ValueType> map =
            //         new EnumMap<>(EnumType.class);

            EnumMap<Day, String> schedule =
                    new EnumMap<>(Day.class);


            // ============================================================
            // 3. put()
            // ============================================================
            // Adds a key-value pair.
            //
            // The KEY must be an enum constant.

            schedule.put(Day.MONDAY, "Java");
            schedule.put(Day.TUESDAY, "DSA");
            schedule.put(Day.WEDNESDAY, "Database");
            schedule.put(Day.THURSDAY, "Spring");
            schedule.put(Day.FRIDAY, "SQL");

            System.out.println("After put():");
            System.out.println(schedule);


            // ============================================================
            // 4. get()
            // ============================================================
            // Returns the value associated with the specified enum key.
            //
            // Returns null if the key does not exist.

            String subject = schedule.get(Day.MONDAY);

            System.out.println(
                    "\nSubject on Monday: " + subject
            );


            // ============================================================
            // 5. getOrDefault()
            // ============================================================
            // Returns the value associated with the key.
            //
            // If the key doesn't exist, returns the default value.

            System.out.println(
                    "Subject on Sunday: " +
                            schedule.getOrDefault(
                                    Day.SUNDAY,
                                    "Holiday"
                            )
            );


            // ============================================================
            // 6. containsKey()
            // ============================================================
            // Checks whether a particular enum key exists.

            System.out.println(
                    "\nDoes MONDAY exist? " +
                            schedule.containsKey(Day.MONDAY)
            );


            // ============================================================
            // 7. containsValue()
            // ============================================================
            // Checks whether a particular value exists.

            System.out.println(
                    "Does 'DSA' exist? " +
                            schedule.containsValue("DSA")
            );


            // ============================================================
            // 8. remove()
            // ============================================================
            // Removes the entry associated with the specified enum key.

            schedule.remove(Day.FRIDAY);

            System.out.println(
                    "\nAfter remove(FRIDAY):"
            );

            System.out.println(schedule);


            // ============================================================
            // 9. remove(key, value)
            // ============================================================
            // Removes the entry only if BOTH the key and value match.

            schedule.remove(Day.THURSDAY, "Spring");

            System.out.println(
                    "\nAfter remove(THURSDAY, \"Spring\"):"
            );

            System.out.println(schedule);


            // ============================================================
            // 10. putIfAbsent()
            // ============================================================
            // Adds the key-value pair only if the key
            // does NOT already exist.

            schedule.putIfAbsent(
                    Day.SATURDAY,
                    "Revision"
            );

            // MONDAY already exists.
            // Therefore, "Python" will NOT replace "Java".

            schedule.putIfAbsent(
                    Day.MONDAY,
                    "Python"
            );

            System.out.println(
                    "\nAfter putIfAbsent():"
            );

            System.out.println(schedule);


            // ============================================================
            // 11. replace(key, value)
            // ============================================================
            // Replaces the existing value for a key.

            schedule.replace(
                    Day.MONDAY,
                    "Advanced Java"
            );

            System.out.println(
                    "\nAfter replace():"
            );

            System.out.println(schedule);


            // ============================================================
            // 12. replace(key, oldValue, newValue)
            // ============================================================
            // Replaces the value only if the old value matches.

            schedule.replace(
                    Day.TUESDAY,
                    "DSA",
                    "Advanced DSA"
            );

            System.out.println(
                    "\nAfter conditional replace():"
            );

            System.out.println(schedule);


            // ============================================================
            // 13. size()
            // ============================================================
            // Returns the number of key-value pairs.

            System.out.println(
                    "\nSize: " + schedule.size()
            );


            // ============================================================
            // 14. isEmpty()
            // ============================================================
            // Returns true if the map contains no entries.

            System.out.println(
                    "Is map empty? " + schedule.isEmpty()
            );


            // ============================================================
            // 15. keySet()
            // ============================================================
            // Returns a Set containing all enum keys.

            System.out.println(
                    "\nKeys: " + schedule.keySet()
            );


            // ============================================================
            // 16. values()
            // ============================================================
            // Returns a Collection containing all values.

            System.out.println(
                    "Values: " + schedule.values()
            );


            // ============================================================
            // 17. entrySet()
            // ============================================================
            // Returns a Set containing all key-value pairs.

            System.out.println(
                    "Entries: " + schedule.entrySet()
            );


            // ============================================================
            // 18. Iterating using keySet()
            // ============================================================
            // Useful when you need the key and then want
            // to retrieve the corresponding value.

            System.out.println(
                    "\nUsing keySet():"
            );

            for (Day day : schedule.keySet()) {

                System.out.println(
                        "Day = " + day +
                                ", Subject = " + schedule.get(day)
                );
            }


            // ============================================================
            // 19. Iterating using entrySet()
            // ============================================================
            // Recommended when you need BOTH key and value.

            System.out.println(
                    "\nUsing entrySet():"
            );

            for (Map.Entry<Day, String> entry
                    : schedule.entrySet()) {

                System.out.println(
                        "Day = " + entry.getKey() +
                                ", Subject = " + entry.getValue()
                );
            }


            // ============================================================
            // 20. forEach()
            // ============================================================
            // Java 8+ lambda-based iteration.

            System.out.println(
                    "\nUsing forEach():"
            );

            schedule.forEach((day, subjectName) -> {

                System.out.println(
                        "Day = " + day +
                                ", Subject = " + subjectName
                );
            });


            // ============================================================
            // 21. replaceAll()
            // ============================================================
            // Replaces EVERY value using a BiFunction.
            //
            // Here we add " Class" to every subject.

            schedule.replaceAll(
                    (day, subjectName) ->
                            subjectName + " Class"
            );

            System.out.println(
                    "\nAfter replaceAll():"
            );

            System.out.println(schedule);


            // ============================================================
            // 22. merge()
            // ============================================================
            // If the key does not exist:
            //     Adds the key-value pair.
            //
            // If the key already exists:
            //     Combines old and new values using the function.

            schedule.merge(
                    Day.MONDAY,
                    " + Practice",
                    (oldValue, newValue) ->
                            oldValue + newValue
            );

            System.out.println(
                    "\nAfter merge():"
            );

            System.out.println(schedule);


            // ============================================================
            // 23. computeIfAbsent()
            // ============================================================
            // Calculates a value only if the key is absent.

            schedule.computeIfAbsent(
                    Day.SUNDAY,
                    day -> "Holiday"
            );

            System.out.println(
                    "\nAfter computeIfAbsent():"
            );

            System.out.println(schedule);


            // ============================================================
            // 24. computeIfPresent()
            // ============================================================
            // Calculates a new value only if the key is already present.

            schedule.computeIfPresent(
                    Day.TUESDAY,
                    (day, oldValue) ->
                            oldValue + " + Practice"
            );

            System.out.println(
                    "\nAfter computeIfPresent():"
            );

            System.out.println(schedule);


            // ============================================================
            // 25. compute()
            // ============================================================
            // Recalculates the value associated with a key.
            //
            // The function receives:
            //     key
            //     current value

            schedule.compute(
                    Day.WEDNESDAY,
                    (day, oldValue) ->
                            oldValue + " + Lab"
            );

            System.out.println(
                    "\nAfter compute():"
            );

            System.out.println(schedule);


            // ============================================================
            // 26. clear()
            // ============================================================
            // Removes ALL entries from the EnumMap.

            schedule.clear();

            System.out.println(
                    "\nAfter clear():"
            );

            System.out.println(schedule);

            System.out.println(
                    "Is map empty now? " +
                            schedule.isEmpty()
            );
        }
}

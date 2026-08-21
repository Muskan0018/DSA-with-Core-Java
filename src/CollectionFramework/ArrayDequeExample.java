package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args){

                /*
                 * =========================================================
                 * PART 1: ARRAYDEQUE AS A STACK
                 * =========================================================
                 *
                 * Stack follows LIFO:
                 *
                 * Last In → First Out
                 *
                 * We use:
                 * push()  -> add to the top
                 * pop()   -> remove from the top
                 * peek()  -> see the top without removing
                 */

                Deque<Integer> stack = new ArrayDeque<>();

                // push() -> adds elements to the top of the stack
                stack.push(10);
                stack.push(20);
                stack.push(30);

                System.out.println("Stack: " + stack);
                // Output: [30, 20, 10]

                // peek() -> returns the top element WITHOUT removing it
                System.out.println("Top element: " + stack.peek());
                // Output: 30

                // pop() -> removes and returns the top element
                System.out.println("Removed: " + stack.pop());
                // Output: 30

                System.out.println("Stack after pop: " + stack);
                // Output: [20, 10]


                /*
                 * =========================================================
                 * PART 2: ARRAYDEQUE AS A QUEUE
                 * =========================================================
                 *
                 * Queue follows FIFO:
                 *
                 * First In → First Out
                 *
                 * We use:
                 * offer() -> add element at the rear
                 * poll()  -> remove element from the front
                 * peek()  -> see the front element
                 */

                Deque<String> queue = new ArrayDeque<>();

                // offer() -> adds an element at the end of the queue
                queue.offer("Virat");
                queue.offer("Kohli");
                queue.offer("King");

                System.out.println("\nQueue: " + queue);
                // Output: [John, Alice, Bob]

                // peek() -> returns the first element WITHOUT removing it
                System.out.println("Front element: " + queue.peek());
                // Output: John

                // poll() -> removes and returns the first element
                System.out.println("Removed: " + queue.poll());
                // Output: John

                System.out.println("Queue after poll: " + queue);
                // Output: [Alice, Bob]


                /*
                 * =========================================================
                 * PART 3: ADDING ELEMENTS FROM BOTH ENDS
                 * =========================================================
                 *
                 * ArrayDeque is a DOUBLE-ENDED QUEUE.
                 *
                 * We can add elements at:
                 *
                 * addFirst() -> beginning
                 * addLast()  -> end
                 */

                Deque<Integer> deque = new ArrayDeque<>();

                // addLast() -> adds at the end
                deque.addLast(20);

                // addFirst() -> adds at the beginning
                deque.addFirst(10);

                // addLast() -> adds at the end
                deque.addLast(30);

                System.out.println("\nDeque: " + deque);
                // Output: [10, 20, 30]


                /*
                 * =========================================================
                 * PART 4: REMOVING ELEMENTS FROM BOTH ENDS
                 * =========================================================
                 */

                // removeFirst() -> removes the first element
                System.out.println("Removed first: " + deque.removeFirst());
                // Output: 10

                System.out.println("Deque: " + deque);
                // Output: [20, 30]

                // removeLast() -> removes the last element
                System.out.println("Removed last: " + deque.removeLast());
                // Output: 30

                System.out.println("Deque: " + deque);
                // Output: [20]


                /*
                 * =========================================================
                 * PART 5: GET ELEMENTS WITHOUT REMOVING
                 * =========================================================
                 *
                 * getFirst() -> returns first element
                 * getLast()  -> returns last element
                 */

                deque.addFirst(10);
                deque.addLast(30);

                System.out.println("\nDeque: " + deque);
                // Output: [10, 20, 30]

                System.out.println("First element: " + deque.getFirst());
                // Output: 10

                System.out.println("Last element: " + deque.getLast());
                // Output: 30


                /*
                 * =========================================================
                 * PART 6: REMOVE SPECIFIC ELEMENT
                 * =========================================================
                 */

                // removeFirstOccurrence()
                deque.removeFirstOccurrence(20);

                System.out.println("\nAfter removeFirstOccurrence(20): " + deque);
                // Output: [10, 30]


                /*
                 * =========================================================
                 * PART 7: ADD / REMOVE USING DIFFERENT METHODS
                 * =========================================================
                 *
                 * add()       -> adds at the end
                 * remove()    -> removes the first element
                 *
                 * These methods are inherited from Collection/Queue behavior.
                 */

                deque.add(40);

                System.out.println("\nAfter add(40): " + deque);
                // Output: [10, 30, 40]

                deque.remove();

                System.out.println("After remove(): " + deque);
                // Output: [30, 40]


                /*
                 * =========================================================
                 * PART 8: CHECKING THE DEQUE
                 * =========================================================
                 */

                // size() -> number of elements
                System.out.println("\nSize: " + deque.size());

                // isEmpty() -> checks whether deque is empty
                System.out.println("Is empty? " + deque.isEmpty());

                // contains() -> checks whether an element exists
                System.out.println("Contains 30? " + deque.contains(30));


                /*
                 * =========================================================
                 * PART 9: CLEAR
                 * =========================================================
                 */

                // clear() -> removes all elements
                deque.clear();

                System.out.println("\nAfter clear(): " + deque);

                System.out.println("Is empty? " + deque.isEmpty());


                /*
                 * =========================================================
                 * PART 10: ITERATING THROUGH ARRAYDEQUE
                 * =========================================================
                 */

                Deque<String> names = new ArrayDeque<>();

                names.add("John");
                names.add("Alice");
                names.add("Bob");

                System.out.println("\nUsing enhanced for loop:");

                for (String name : names) {
                    System.out.println(name);
                }


                /*
                 * =========================================================
                 * PART 11: ITERATOR
                 * =========================================================
                 */

//                System.out.println("\nUsing Iterator:");
//
//                var iterator = names.iterator();
//
//                while (iterator.hasNext()) {
//
//                    // next() returns the next element
//                    String name = iterator.next();
//
//                    System.out.println(name);
//                }


                /*
                 * =========================================================
                 * IMPORTANT METHODS SUMMARY
                 * =========================================================
                 *
                 * STACK:
                 *
                 * push()  -> add at front/top
                 * pop()   -> remove from front/top
                 * peek()  -> view front/top
                 *
                 *
                 * QUEUE:
                 *
                 * offer() -> add at end
                 * poll()  -> remove from front
                 * peek()  -> view front
                 *
                 *
                 * DEQUE:
                 *
                 * addFirst()
                 * addLast()
                 * removeFirst()
                 * removeLast()
                 * getFirst()
                 * getLast()
                 *
                 *
                 * GENERAL:
                 *
                 * add()
                 * remove()
                 * contains()
                 * size()
                 * isEmpty()
                 * clear()
                 */

    }
}

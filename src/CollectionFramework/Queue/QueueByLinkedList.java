package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueByLinkedList {
    public static void main(String[] args) {

        /*
         * =========================================================
         * PART 1: LINKEDLIST Implementation
         * =========================================================
         *
         * We use:
         * offer()  -> (insertion) add to the top
         * poll()   -> (deletion) remove from the top
         * peek()  -> (accessing the front element) see the top without removing
         */

    // LinkedList implementation
        Queue<Integer> q = new LinkedList<>();
//        Deque<Integer> q1 = new LinkedList<>();    //  we can also take the Deque reference

        // add() -> Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exection.
//        q.add(10);
//        q.add(20);
//        q.add(30);

// for DSA we use offer() rather than add() because we cannot want to handle the exception in DSA.

         // offer() -> Inserts the specified element into the queue. If the task is successful, offer() return true, if not it return false
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println("Queue is: " + q);


        // element() -> Returns the head of the Queue. Throws an exception if the queue is empty.
          //q.element();

// for DSA we use peek() rather than element() because we cannot want to handle the exception in DSA.

       // peek() -> Returns the head of the Queue. Returns null if the queue is empty.
        System.out.println("peek: " + q.peek());
        System.out.println("Queue after peek: " + q);

       // remove() -> Returns and removes the head of the Queue. Throws an exception if the queue is empty
         // q.remove();

//  for DSA we use poll() rather than remove() because we cannot want to handle the exception in DSA.

      // poll() -> Returns and removes the head of the Queue. Returns null if the queue is empty
        System.out.println("poll: " + q.poll());
        System.out.println("After poll: " + q);


    }
}

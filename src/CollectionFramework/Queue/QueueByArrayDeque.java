package CollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueByArrayDeque {
    public static void main(String[] args) {

        /*
         * =========================================================
         * PART 1: ArrayDeque Implementation
         * =========================================================
         *
         * We use:
         * All Basic Methods +
         * offer()  -> (insertion) add to the top
         * poll()   -> (deletion) remove from the top
         * peek()  -> (accessing the front element) see the top without removing
         */

        // ArrayDeque implementation
//        Queue<Integer> q = new ArrayDeque<>();
        Deque<Integer> q = new ArrayDeque<>();    // for using the methods likr offerFirst(), offerLast() & so on...

        q.offer(200);   // adds an element in the queue
        q.offer(300);
        q.offer(400);
        q.offer(500);
        q.offerFirst(100);      // adds an element at the beginning of the Queue
        q.offerLast(600);      // adds an element at the end of the Queue
        System.out.println("Queue: " + q);

        // pollFirst() ->  remove the first element of the queue
        System.out.println("pollFirst: " + q.pollFirst());
        // pollLast() ->   // remove the last element of the Queue
        System.out.println("pollLast: " + q.pollLast());

        System.out.println("Queue after poll: " + q);

        // peekFirst() -> return the FRONT element of the Queue
        System.out.println("peekFirst: " + q.peekFirst());
        // peekLast() -> return the REAR element of the QUeue without rem
        System.out.println("peekLast: " + q.peekLast());

        System.out.println("Queue after peek: " + q);

        System.out.println("Size of the Queue: " + q.size());



    }
}

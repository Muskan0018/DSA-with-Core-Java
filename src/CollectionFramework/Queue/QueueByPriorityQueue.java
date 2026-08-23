package CollectionFramework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueByPriorityQueue {
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

        // Priority Queue for Integer

        // PriorityQueue implementation
//        Queue<Integer> pq = new PriorityQueue<>();

        // Min Heap → smallest element has the highest priority.

        // if we want to give High Priority to the high value Integer.
           // we can do this by using comparator
        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);   // using this Lambda Function (comparator) we can converted code into maxHeap
         // Max Heap → largest element has the highest priority.
          // maxHeap -> it says that in the case of Integers: the Higher the Integer Value, the Higher its Priority

        pq.offer(40);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        System.out.println("Priority Queue: " + pq);

        // default behavior for Integer -> less value = High Priority (through minHeap)
        System.out.println("poll 1: " + pq.poll());      // removal order is: 10 -> 20 -> 30 -> 40
        System.out.println("Queue after poll 1: " + pq);

        System.out.println("poll 2: " + pq.poll());
        System.out.println("Queue after poll 2: " + pq);

        // Priority Queue for String
    }
}

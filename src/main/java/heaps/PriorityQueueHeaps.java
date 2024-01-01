package heaps;

import java.util.PriorityQueue;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - heaps
 * Created_on - 01 January-2024
 * Created_at - 20 : 25
 */

public class PriorityQueueHeaps {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(6);
        pq.add(7);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        pq.add(2);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}

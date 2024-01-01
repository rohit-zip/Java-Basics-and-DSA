package heaps;

import java.util.PriorityQueue;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - heaps
 * Created_on - 01 January-2024
 * Created_at - 20 : 35
 */

public class KLargestElements {

    public static PriorityQueue<Integer> process(int[] array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0 ; i<array.length ; i++) {
            if (i < k) {
                pq.add(array[i]);
            } else {
                if (pq.peek() < array[i]) {
                    pq.remove();
                    pq.add(array[i]);
                }
            }
        }
        return pq;
    }

    public static void main(String[] args) {
        int[] array = {2, 10, 5, 17, 7, 18, 6, 4};
        System.out.println(process(array, 3));
    }
}

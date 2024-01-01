package heaps;

import java.util.PriorityQueue;

/**
 * Owner - Rohit Parihar
 * Author - rohit
 * Project - Atharva_Tutorial
 * Package - heaps
 * Created_on - 01 January-2024
 * Created_at - 20 : 48
 */

public class KSortedArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 6, 7, 5, 8, 9};
        int k = 2;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0 ; i<=k ; i++) {
            pq.add(array[i]);
        }

        for (int i=k+1 ; i<array.length ; i++) {
            System.out.print(pq.remove() + " ");
            pq.add(array[i]);
        }

        while (pq.size() > 0) {
            System.out.print(pq.remove() + " ");
        }
    }
}

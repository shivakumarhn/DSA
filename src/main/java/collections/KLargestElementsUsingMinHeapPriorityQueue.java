package collections;

import java.util.PriorityQueue;

public class KLargestElementsUsingMinHeapPriorityQueue {

    static void printKLargeElements(int arr[], int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++)
            pq.add(arr[i]);

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq);
    }

    public static void main(String[] args) {

        printKLargeElements(new int[]{5, 15, 10, 20, 8, 25, 18}, 3);
    }
}

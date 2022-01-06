package gfg.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    static int[] kLargest(int[] arr, int n, int k) {
        // code here

       /* if(n < k)
           return new empty[3];*/

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++)
            pq.offer(arr[i]);

        for (int i = k; i < n; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }


        int[] res = new int[pq.size()];

        for (int i = pq.size() - 1; i >= 0; i--)
            res[i] = pq.poll();

        return res;
    }

    public static void main(String[] args) {

        int n = 7, k = 3;
        int arr[] = {1, 23, 12, 9, 30, 2, 50};

        System.out.println(Arrays.toString(kLargest(arr, n, k)));

    }
}

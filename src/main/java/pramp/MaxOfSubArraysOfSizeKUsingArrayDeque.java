package pramp;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxOfSubArraysOfSizeKUsingArrayDeque {

    // O(n2)
    static void maxOfSubArray(int[] arr, int k) {

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i + 1; j < i + k; j++)
                max = Math.max(max, arr[j]);
            System.out.println(max);
        }
    }

    // A Dequeue (Double ended queue) based
    // method for printing maximum element of
    // all sub arrays of size k
    static void printMax(int arr[], int n, int k) {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e.,
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> dq = new ArrayDeque<Integer>();

        /* Process first k (or first window) elements of array */

        for (int i = 0; i < k; ++i) {
            // For every element, the previous smaller elements are useless so
            // remove them from Qi
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.removeLast(); // Remove from rear

            // Add new element at rear of queue
            dq.addLast(i);
        }

        // Process rest of the elements, i.e.,
        // from arr[k] to arr[n-1]
        for (int i = k; i < n; ++i) {
            // The element at the front of the queue is the
            //  largest element of previous window, so print it
            System.out.print(arr[dq.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!dq.isEmpty()) && dq.peek() <= i - k)
                dq.removeFirst();

            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while ((!dq.isEmpty()) && arr[i] >= arr[dq.peekLast()])
                dq.removeLast();

            // Add current element at the rear of Qi
            dq.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {

        int[] arr = {10, 8, 5, 12, 15, 7, 6};
        maxOfSubArray(arr, 4);

        int arr2[] = {20, 40, 30, 10, 60};
        int k = 3;
        printMax(arr2, arr2.length, k);
    }

}

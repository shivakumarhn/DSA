package collections;

import arrays.Arraylist;

import java.util.*;

public class NextGreaterElementUsingStack {

    static void nextGreaterElement(int[] arr) {

        //TC = O(n2) AS = O(1) //{5, 15, 10, 8, 6, 12, 7};
        for (int i = 0; i < arr.length; i++) {
            int pg = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    pg = arr[j];
                    break;
                }
            }
            System.out.print(pg + " ");
        }

        System.out.println("\n================================");

        //TC = O(n) and AS = O(n)
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        stack.push(arr[n - 1]);
        int[] res = new int[n];
        res[n - 1] = -1;

        for (int i = n-2; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }
            res[i] = (stack.isEmpty()) ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        for (int j=0; j<res.length; j++)
            System.out.print(res[j]+ " ");

      /* for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j >= 0 && arr[j] < arr[i])
                j--;
            if (arr[j] > arr[i])
                System.out.println("Previous greater of " + arr[i] + " is " + arr[j]);
            else
                System.out.println(-1);
        }*/
    }


    public static void main(String[] args) {

        int[] arr = {5, 15, 10, 8, 6, 12, 7};

        nextGreaterElement(arr);
    }
}

package pramp;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElementUsingStack {

    static void prevGreaterElement(int[] arr) {

        //TC = O(n2) and AS = (1)[since it is not using any array or list]
        for (int i = 0; i < arr.length; i++) {
            int pg = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    pg = arr[j];
                    break;
                }
            }
            System.out.println(pg);
        }

        System.out.println("================================");
       //TC = O(n) and AS = O(n)
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(arr[0]);
        int pg = -1;
        System.out.println("PG of " + stack.peek() + " is " + pg);

        for (int i = 1; i < arr.length; i++) {

            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }
            pg = (stack.isEmpty()) ? -1 : stack.peek();
            System.out.println("PG of " + arr[i] + " is " + pg);
            stack.push(arr[i]);

        }


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

        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        prevGreaterElement(arr);
    }
}

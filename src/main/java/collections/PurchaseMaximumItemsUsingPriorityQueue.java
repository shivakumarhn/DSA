package collections;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PurchaseMaximumItemsUsingPriorityQueue {

    static int purchaseMax(List<Integer> ls, int sum) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(ls);
        int res = 0;

        while (res >= 0 && pq.isEmpty() == false && pq.peek() <= sum) {
            sum = sum - pq.poll();
            res++;
        }
        return res;
    }

    public static void main(String[] args) {

        Integer arr[] = {1, 12, 5, 111, 200};
        List<Integer> ls = Arrays.asList(arr);
        System.out.println(purchaseMax(ls, 10));
    }
}

package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseFirstKElementsUsingQueue {


    static void reversFirstKItems(Queue<Integer> q, int k) {

        if (q.size() < k || k <= 0)
            return;

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < k; i++)
            stack.push(q.poll());
        System.out.println(stack);
        System.out.println(q);
        while (stack.isEmpty() == false)
            q.offer(stack.pop());
        System.out.println(q);

        for (int i = 0; i < q.size() - k; i++)
            q.offer(q.poll());
        System.out.println(q);

    }

    public static void main(String[] args) {

        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);
        reversFirstKItems(q, 3);

    }
}

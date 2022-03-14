package Miscellanious;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintBinaryRepAndCountOnes {


    static void binary(int n) {

        if (n > 1)
            binary(n / 2);
        System.out.print(n % 2);
    }

    //  TC = O(n) && AS = O(n)
    static int binary2(int n) {

        int count = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        while (n > 1) {
            stack.push(n % 2);
            if (n % 2 == 1)
                count += 1;
            n = n / 2;
        }
        stack.push(n);
        for (int bin : stack)
            System.out.print(bin);
        System.out.println();

        if (n == 1)
            return count + 1;
        else
            return count;
    }

    public static void main(String[] args) {

        int n = 15;
        // binary(n);
        System.out.println(binary2(n));
    }
}

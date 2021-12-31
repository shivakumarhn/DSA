package collections;

import java.util.HashMap;
import java.util.HashSet;

public class PrintRepeatingElementsInArrayUsingHashSet {


    //TC = O(n2) and AS = O(1)
    static void printDistinctElementNaive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                System.out.println(arr[i]);
        }
    }

    //TC = O(n) and SC = O(n)
    static void printDistinctElementBigOn(int[] arr) {
        int n = arr.length;
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (h.contains(arr[i]))
                System.out.println(arr[i]);
            else
                h.add(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 10};
        int[] arr1 = {2, 2, 2, 2};
        printDistinctElementNaive(arr);
        System.out.println("=======");
        printDistinctElementBigOn(arr1);
    }
}

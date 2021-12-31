package collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class GreaterElementOfEachElementInArrayUsingTreeMap {

    //TC = O(n2) and SC = O(n)
    static void greaterElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[j] > arr[i])
                    count++;
            }
            System.out.println(count);
        }
    }

    //TC = O(nLogn) and AC = O(n)
    static void greaterElementsBigoN(int[] arr) {
        int n = arr.length;

        TreeMap<Integer, Integer> t = new TreeMap<>(Collections.reverseOrder());

        for (int x : arr)
            t.put(x, t.getOrDefault(x, 0) + 1);

        int cumFre = 0;
        for (Map.Entry<Integer, Integer> m : t.entrySet()) {
            int temp = m.getKey();
            t.put(m.getKey(), cumFre);
            cumFre += temp;
        }
        for (int x : arr)
            System.out.println(t.get(x));


    }


    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 30, 8};
        greaterElements(arr);
    }
}

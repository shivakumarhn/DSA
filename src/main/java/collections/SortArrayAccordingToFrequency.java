package collections;

import java.util.*;

public class SortArrayAccordingToFrequency {

    static void sortWithFrequency(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i : arr)
            m.put(i, m.getOrDefault(i, 0) + 1);
        System.out.println(m);

        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l, new MyCmp());
        System.out.println(l);

        int index = 0;
        for (Map.Entry<Integer, Integer> e : l)
            for (int i = 0; i < e.getValue(); i++)
                arr[index++] = e.getKey();
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 10, 10, 5, 20};
        sortWithFrequency(arr);

    }
}

class MyCmp implements Comparator<Map.Entry<Integer, Integer>> {

    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if (m1.getValue() == m2.getValue())
            return m1.getKey() - m2.getKey();
        else
            return m2.getValue() - m1.getValue();
    }
}
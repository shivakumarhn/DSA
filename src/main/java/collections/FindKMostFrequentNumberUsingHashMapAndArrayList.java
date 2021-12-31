package collections;

import java.util.*;

public class FindKMostFrequentNumberUsingHashMapAndArrayList {

    //O(nLogN) using hash map and array List
    static void kTopFre(int arr[], int k) {

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(m.entrySet());
        System.out.println(list);

        Collections.sort(list, new MyComp());
        System.out.println(list);

        for (int i = 0; i < k; i++)
            System.out.println(list.get(i).getKey());
    }

    //O(nLogK) using hash map and Priority Queue

    static void kTopFreUsingPQ(int arr[], int k) {

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++)
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        System.out.println(m.entrySet());

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new MyComp());

        for (Map.Entry<Integer, Integer> x : m.entrySet())
            pq.add(x);

        System.out.println(pq);

        for (int i = 0; i < k; i++)
            System.out.println(pq.poll().getKey());
    }

    //O(nLogK) using hash map and Priority Queue

    static void kTopFreUsingPQLinearTime(int[] arr, int k) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        System.out.println(m);

        List<List<Integer>> fre = new ArrayList<List<Integer>>();
        for (int i = 0; i <= arr.length; i++)
            fre.add(new ArrayList<>());
        System.out.println(fre);

        for (Map.Entry<Integer, Integer> x : m.entrySet())
            fre.get(x.getValue()).add(x.getKey());

        int count = 0;
        for (int i = arr.length; i >= 0; i--) {
            for (int x : fre.get(i)) {
                System.out.println(x);
                count++;
                if (count == k)
                    return;
            }
        }
    }


    public static void main(String[] args) {

        int arr1[] = {10, 20, 10, 30, 10, 20, 30};
        kTopFre(arr1, 2);

        System.out.println("=============");

        int arr2[] = {10, 20, 10, 30, 10, 20, 30};
        kTopFreUsingPQ(arr2, 2);

        System.out.println("=============");

        int arr3[] = {10, 5, 20, 5, 10, 10, 30};
        kTopFreUsingPQLinearTime(arr3, 2);
    }

}

class MyComp implements Comparator<Map.Entry<Integer, Integer>> {

    @Override
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if (m1.getValue() == m2.getValue())
            return m1.getKey() - m2.getKey();
        else
            return m2.getValue() - m1.getValue();
    }
}

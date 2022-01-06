package collections;

import java.util.*;

public class SortingOneArrayAccordingToOther {

    static void sortOneArrayFromOther(int a1[], char a2[]) {

      /*  Map<Integer, Character> m = new TreeMap<>();
        for (int i = 0; i < a1.length; i++) {
            m.put(a1[i], a2[i]);
        }
        for (Map.Entry<Integer, Character> e : m.entrySet())
            System.out.println(e.getValue());*/


        List<ArrayItems> l = new ArrayList<>();

        for (int i = 0; i < a1.length; i++) {
            l.add(new ArrayItems(a1[i], a2[i]));
        }

        Collections.sort(l, (i1, i2) -> (i1.num - i2.num));

        for (ArrayItems it : l)
            System.out.println(it.ch);

    }

    public static void main(String[] args) {

        int arr[] = {3, 1, 2};
        char arr2[] = {'G', 'E', 'K'};

        sortOneArrayFromOther(arr, arr2);
    }
}

class ArrayItems {

    int num;
    char ch;

    ArrayItems(int n, char c) {
        num = n;
        ch = c;
    }
}
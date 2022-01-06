package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KeepingIndexAfterSortingUsingCollectionSort {

    static void printIndexOfSorted(int[] arr) {

        int n = arr.length;

        List<ArrayItem> l = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
            l.add(new ArrayItem(arr[i], i));

        Collections.sort(l, (ai1, ai2) -> (ai1.item - ai2.item));

        for (ArrayItem el : l)
            System.out.println(el.item + " " + el.index);

    }


    public static void main(String[] args) {

        int[] arr = {20, 10, 5, 4};

        printIndexOfSorted(arr);

    }

}

class ArrayItem {

    int item;
    int index;

    ArrayItem(int it, int id) {
        item = it;
        index = id;
    }
}

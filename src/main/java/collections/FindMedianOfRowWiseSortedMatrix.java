package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedianOfRowWiseSortedMatrix {

    static int median(int[][] arr) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
            // System.out.println();
        }
        Collections.sort(list);
        System.out.println(list);

        int l = 0;
        int h = list.size() - 1;
        int mid = l + (h - l) / 2;
        return list.get(mid);


      /*  while (h >= l) {

            int mid = l + (h - l) / 2;

            if (list.get(mid) == search)
                return mid;
            if (list.get(mid) > search)
                h = mid - 1;
            else
                l = mid + 1;
        }*/


        // return -1;
    }


    static int secondLarge(int[] arr) {

        int n = arr.length;

        int large = 0;
        int secondLarge = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[large]) {
                secondLarge = large;
                large = i;
            }

            if (arr[i] != arr[large])
                if (secondLarge == -1 || arr[i] > arr[secondLarge])
                    secondLarge = i;
        }

        return secondLarge;
    }


    public static void main(String[] args) {

        int[][] arr = {{1, 10, 20}, {15, 25, 30}, {5, 8, 40}};
        int a[] = {20, 10, 20, 8, 12};
        System.out.println(secondLarge(a));
    }
}

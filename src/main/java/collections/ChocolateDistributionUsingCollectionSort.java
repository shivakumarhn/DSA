package collections;

import java.util.Arrays;

public class ChocolateDistributionUsingCollectionSort {

    //O(nLogn) and AS = 0(1)
    static int thief(int[] arr, int m) {
        int n = arr.length;
        if (n < m)
            return -1;

        Arrays.sort(arr); //O(nLogn)
        System.out.println(Arrays.toString(arr));
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) { //0(k)
            if (diff > (arr[i + m - 1] - arr[i]))
                diff = (arr[i + m - 1] - arr[i]);
        }
        return diff;
    }

    public static void main(String args[]) {

        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int k = 3;
        int arr1[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int n = 5;

        System.out.println(thief(arr, k));
        System.out.println(thief(arr1, n));
    }
}

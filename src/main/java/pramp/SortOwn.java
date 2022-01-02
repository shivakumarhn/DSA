package pramp;

import java.util.Arrays;

public class SortOwn {

    static void sort(int[] arr) {


        int n = arr.length;
        if (n == 0)
            return;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        int arr[] = {7, 3, 2, 4, 9, 12, 56};

        sort(arr);
    }
}

package arrays;

import java.util.Arrays;

public class LeftRotateArrayByNTimes {

    // TC = 0(nd) and AS = 0(1)
    static void leftRotateByNElements(int arr[], int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            leftRotate(arr, n);
        }
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++)
            arr[i - 1] = arr[i];
        arr[n - 1] = temp;
    }

    // TC = 0(n) and AS = 0(n)
    static void lestRotateByNElements2(int arr[], int d) {
        int n = arr.length;
        int temp[] = new int[d];

        for (int i = 0; i < d; i++)
            temp[i] = arr[i];

        for (int i = d; i < n; i++)
            arr[i - d] = arr[i];

        for (int i = 0; i < d; i++)
            arr[n - d + i] = temp[i];

        System.out.println(Arrays.toString(arr));
    }

    // TC = 0(n) and AS = 0(1)
    static void lestRotateByNElements3(int arr[], int d) {
        int n = arr.length;
        reversal(arr, 0, d - 1);
        reversal(arr, d, n - 1);
        reversal(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reversal(int[] arr, int low, int high) {

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }


    public static void main(String args[]) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int d = 3;

        leftRotateByNElements(arr, d);
        lestRotateByNElements2(arr2, d);
        lestRotateByNElements3(arr3, d);
    }
}

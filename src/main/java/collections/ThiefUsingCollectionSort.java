package collections;

import java.util.Arrays;

public class ThiefUsingCollectionSort {

    //O(nLogn) and AS = 0(1)
    static int thief(int[] arr, int k){
        int n = arr.length;
        if( n < k)
            return -1;

        Arrays.sort(arr); //O(nLogn)
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=n-1; i >= n-k; i--)  //0(k)
            sum += arr[i];
        return sum;
    }

    public static void main(String args[]) {

        int arr[] = {3, 7, 2, 5, 12, 30};
        int k = 3;
        int arr1[] = {8, 10, 2, 50, 80, 20};
        int n = 4;

        System.out.println(thief(arr, k));
        System.out.println(thief(arr1, n));
    }
}

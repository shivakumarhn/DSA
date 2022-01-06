package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    // TC = O(n) and space = O(n)
    static int removeDuplicates(int[] arr){

        int n = arr.length;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != temp[res-1]){
                temp[res] = arr[i];
                res++;
            }
        }
        for(int i = 0; i < res; i++)
        {
            arr[i] = temp[i];
        }
       // System.out.println(Arrays.toString(arr));
        return res;
    }


    static int removeDuplicates2(int[] arr){

        int res = 1;
        for (int i=1; i<arr.length; i++){
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];
                res++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return res;
    }


    public static void main(String args[]) {

        int[] arr = {10, 20, 20, 30, 30, 30};

        // removeDuplicates(arr);
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));

    }
}

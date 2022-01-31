package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

    static void moveZerosToEnd(int arr[]) {


        int n = arr.length;
        // TC O(n2)
        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j] + arr[i];
                        arr[j] = arr[i] - arr[j];
                        arr[i] = arr[i] - arr[j];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //TC = O(n)
    static void naive(int arr[]){

        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){

            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String args[]) {

        int[] arr = {8, 5, 0, 10, 0, 20, 0};
        int[] arr2 = {0, 5, 10, 10, 20, 0, 0};

        moveZerosToEnd(arr);
        naive(arr2);

    }
}
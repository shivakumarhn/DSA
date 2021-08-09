package bitmagic;

import java.util.ArrayList;

public class TwoOddOccurring {

    // Naive solution, TC = O(n2)
    static ArrayList<Integer> oddAppearing(int arr[], int n) {

        ArrayList<Integer> odd = new ArrayList();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j])
                    count++;
            if (count % 2 != 0)
                //  System.out.println(arr[i]);
                odd.add(arr[i]);
        }
        return odd;
    }


    //Efficient method, TC = 0(n) AS = 0(1)
    static void oddAppearing2(int arr[], int n) {

        int XOR = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++)
            XOR = XOR ^ arr[i];

        int sn = XOR & ~(XOR - 1); // This is number whose original number’s only bit is set

        for (int i = 0; i < n; i++) {
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + ", " + res2);
    }


    public static void main(String[] args) {

        int arr[] = {3, 4, 3, 4, 5, 4, 4, 6, 7, 7}, n = 10;
        System.out.println(oddAppearing(arr, n));

        int[] arr2 = {3, 4, 3, 4, 8, 4, 4, 32, 7, 7};
        n = 10;
        oddAppearing2(arr2, n);
    }
}

package gfg.arrays;

import java.util.HashSet;

public class FirstRepeatingElement {

    // TC = O(n2) and AS = O(1)
    static int firstRepeatingInteger(int arr[]) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    return arr[i];

        return -1;
    }


    // TC = O(nlongN) and AS = O(1)



    // TC = O(n) and AS = O(n)
    static int firstRepeatingElement(int arr[]) {

        int n = arr.length;
        int res = -1;
        HashSet<Integer> set = new HashSet<>();

        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                res = i;
            else
                set.add(arr[i]);
        }

        if (res != -1)
            return arr[res];
        else
            return -1;
    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 9, 6, 8, 3, 8, 7, 5};
        int arr1[] = {2, 3, 4};
        int arr2[] = {2, 3, 3, 4};
        int arr3[] = {6};


        System.out.println(firstRepeatingElement(arr));
        System.out.println(firstRepeatingElement(arr1));
        System.out.println(firstRepeatingElement(arr2));
        System.out.print(firstRepeatingElement(arr3));

    }


    /*
      i = 0, arr[i] = 5 & j = 1 => 6, j = 2 => 7, ........ j = 9, arr[i] == arr[j]
     */
}

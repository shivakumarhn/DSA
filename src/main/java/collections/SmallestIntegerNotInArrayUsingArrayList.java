package collections;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestIntegerNotInArrayUsingArrayList {

    //Brute-force solution, TC = n*Logn
    static int getDifferentNumber(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int i;
        for (i = 0; i < arr.length; i++)
            if (i != arr[i])
                return i;
        return arr.length;
    }
    //Efficient solution, TC = O(n)
    static int getDifferentNumber2(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);

        int i;
        for (i = 0; i < arr.length; i++)
            if (!set.contains(i))
                return i;
        return i;
    }

    public static void main(String[] args) {

        int arr[] = {4, 7, 3, 5, 1, 2, 6, 0};

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Smallest non-negative integer which is not present is --> " + getDifferentNumber(arr));

        System.out.println("Smallest non-negative integer which is not present is --> " + getDifferentNumber2(arr));


    }
}

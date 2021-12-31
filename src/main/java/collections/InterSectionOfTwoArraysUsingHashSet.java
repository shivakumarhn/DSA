package collections;

import java.util.HashSet;

public class InterSectionOfTwoArraysUsingHashSet {

    //TC = O(n+m) and SC = O(n)
    static void printDistinctElementNaive(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }

    //TC = 0(n+m) and AS = 0(n)
    static void printDistinctElementBigoN(int[] arr1, int[] arr2) {

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < arr2.length; i++)
            h.add(arr2[i]);
        for (int j = 0; j < arr1.length; j++)
            if (h.contains(arr1[j]))
                System.out.print(arr1[j] + " ");
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 15, 20, 25, 30, 50};
        int[] arr2 = {30, 5, 15, 80};

        printDistinctElementNaive(arr1, arr2);
        System.out.println("\n=========");
        printDistinctElementBigoN(arr1, arr2);
    }
}

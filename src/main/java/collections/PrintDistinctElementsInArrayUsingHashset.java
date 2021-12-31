package collections;

import java.util.HashSet;

public class PrintDistinctElementsInArrayUsingHashset {

    static void printDistinctElement(int[] arr) {

        //TC = O(n2) and AS = O(1)
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.println(arr[i]);
        }
    }

    //TC = O(n) and SC = O(n)
    static void printDistinctElementBigoN(int[] arr) {

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (hs.contains(arr[i]) == false) {
                hs.add(arr[i]);
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {10, 8, 10, 10, 7};
        printDistinctElement(arr);

        System.out.println("============");
        printDistinctElementBigoN(arr);
    }

}

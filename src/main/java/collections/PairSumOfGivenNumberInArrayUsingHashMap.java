package collections;

import java.util.HashSet;

public class PairSumOfGivenNumberInArrayUsingHashMap {

    //TC = O(n2) and SC = O(n)
    static boolean isPair(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }

    //TC = 0(n) and AS = 0(n)
    static boolean isPairBigoN(int[] arr, int sum) {

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < arr.length; i++)
            if (h.contains(sum - arr[i]))
                return true;
            else
                h.add(arr[i]);
        return false;
    }


    public static void main(String[] args) {

        int[] arr = {3, 2, 8, 15, -8};
        System.out.println(isPair(arr, 17));

        System.out.println(isPairBigoN(arr, 17));
    }
}

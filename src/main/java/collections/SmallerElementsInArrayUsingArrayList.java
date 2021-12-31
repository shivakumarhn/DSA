package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallerElementsInArrayUsingArrayList {

    static List<Integer> smallerList(int[] arr, int k) {

        List<Integer> al = new ArrayList<Integer>(); // Use list since in future if required to change to linked list it would be easy

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k)
                al.add(arr[i]);
        }
        return al;
    }

    public static void main(String[] args) {

        int[] arr = {8, 100, 20, 40, 3, 7};
        System.out.println(Arrays.toString(arr));
        List<Integer> list = smallerList(arr, 10);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}

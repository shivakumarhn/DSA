package arrays;

public class MaximumDifferenceProblemWithOrder {


    //TC = O(n2) and AS = O(1)
    static void maxDiff(int arr[]) {

        int n = arr.length;
        int diff = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] > diff)
                    diff = arr[j] - arr[i];
            }
        }
        System.out.println(diff);
    }

    //TC = O(n) and AS = O(1)
    static void maxDiff2(int arr[]) {

        int n = arr.length;
        int res = arr[1] - arr[0], minVal = arr[0];

        for (int i = 1; i < n; i++) {
            if (res < (arr[i] - minVal))
                res = arr[i] - minVal;
            if (minVal > arr[i])
                minVal = arr[i];
        }
        System.out.println(res);
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int[] arr2 = {7, 9, 5, 6, 3, 2};
        int[] arr3 = {10, 20, 30};
        int[] arr4 = {30, 10, 8, 2};
        maxDiff(arr);
        maxDiff(arr2);
        maxDiff(arr3);
        maxDiff(arr4);


        maxDiff2(arr);
        maxDiff2(arr2);
        maxDiff2(arr3);
        maxDiff2(arr4);
    }
}

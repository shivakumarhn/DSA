package arrays;

public class MaximumSUmOfSubArray {

    // TC = O(n2) & AS = O(1)
    static int maxSubArraySum(int[] arr) {

        int n = arr.length;
        int maxSum = arr[0];

        for (int i = 0; i < n - 1; i++) {
            int maxEnding = 0;
            for (int j = i; j < n; j++) {
                maxEnding = maxEnding + arr[j];
                if (maxEnding > maxSum) // or maxSum = Math.max(maxEnding, maxSum)
                    maxSum = maxEnding;
            }
        }
        return maxSum;
    }

    // TC = O(n) & AS = O(1)
    static int maxSubArraySum2(int[] arr) {

        int n = arr.length;
        int maxEnding = arr[0], maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = maxEnding + arr[i];
            if (maxEnding < arr[i])
                maxEnding = arr[i];
            if (maxEnding > maxSum)
                maxSum = maxEnding;
           /*   Or
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            maxSum = Math.max(maxEnding, maxSum); */
        }

        return maxSum;
    }

    public static void main(String args[]) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {5, 8, 3};
        int[] arr3 = {-6, -1, -8};
        int[] arr4 = {0, -1, 0};

        System.out.println(maxSubArraySum(arr));
        System.out.println(maxSubArraySum2(arr2));
        System.out.println(maxSubArraySum(arr3));
        System.out.println(maxSubArraySum(arr4));
    }
}

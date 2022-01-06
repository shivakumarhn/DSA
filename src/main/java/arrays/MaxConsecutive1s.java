package arrays;

public class MaxConsecutive1s {

    //TC = O(n2) and AS = O(1)
    static int maxConsecutiveOnes(int arr[])
    {
        int res = 0, n = arr.length;
        for(int i = 0; i < n; i++)
        {
            int curr = 0;
            for(int j = i; j < n; j++)
            {
                if(arr[j] == 1) curr++;
                else break;
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    //TC = O(n) and AS = O(1)
    static int maxConsecutiveOnes2(int arr[]) {

        int curCount = 0, maxCount = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                curCount = 0;
            else {
                curCount++;
                maxCount = Math.max(curCount, maxCount);
            }
        }
        return maxCount;

    }

    //TC = O(n) and AS = O(1) My solution
    static int maxConsecutiveOnesOwn(int arr[]) {

        int curCount = 0, maxCount = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                curCount++;
            } else if (curCount > maxCount) {
                maxCount = curCount;
                curCount = 0;
            }
        }
        if (curCount > maxCount)
            maxCount = curCount;
        return maxCount;

    }

    public static void main(String args[]) {

        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1};
        int[] arr3 = {0, 0, 0, 0, 0};
        int[] arr0 = {0};
        int[] arr4 = {1};

        System.out.println(maxConsecutiveOnes(arr));
        System.out.println(maxConsecutiveOnes(arr2));
        System.out.println(maxConsecutiveOnes(arr3));
        System.out.println(maxConsecutiveOnes(arr4));
    }
}

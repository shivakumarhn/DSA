package gfg.arrays;

import java.util.HashSet;

public class FirstMissingPositiveInteger {


    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++)
            set.add(nums[i]);

        for (int i = 1; i < n; i++)
            if (!set.contains(i))
                return i;

        return n;
    }


    //TC = O(n) & AS = O(n)
    public static int firstMissingPositive1(int[] nums) {

        int[] count = new int[nums.length + 1];
        for (int n : nums) {
            if (n > 0 && n <= nums.length) {
                count[n]++;
            }
        }
        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return count.length;

    }


    public static int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            System.out.print(" " + val);
            if (val > n) {
                continue;
            }

            val = val - 1;
            if (nums[val] > 0) {
                nums[val] *= -1;
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String args[]) {
        //int arr[] = {0, -1, 15, 1, 5, -3, 2, 4, 6, -2, 3, 5};
        int arr[] = {5};

        // System.out.println("Missing positive number => " + firstMissingPositive(arr));
        System.out.println("Missing positive number => " + firstMissingPositive1(arr));
    }


}

package gfg.arrays;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = mergeSortedArrays(nums1, nums2);
        int mid = nums3.length / 2;
        return nums3.length % 2 != 0 ? nums3[mid] : (nums3[mid] + nums3[mid - 1]) / 2.0;
    }

    /* Merge Two Sorted Array into one sorted array, eg:
     * [1,3]
     * [2,4]
     * -> [1,2,3,4]
     */
    private static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        // Store remaining elements of first array
        while (i < n1)
            nums3[k++] = nums1[i++];

        // Store remaining elements of second array
        while (j < n2)
            nums3[k++] = nums2[j++];
        return nums3;
    }

    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int cnt1 = 0, cnt2 = 0, temp = 0;
        while (cnt1 < nums1.length || cnt2 < nums2.length) {
            if (cnt1 == nums1.length) {
                arr[temp] = nums2[cnt2];
                cnt2++;
            } else if (cnt2 == nums2.length) {
                arr[temp] = nums1[cnt1];
                cnt1++;
            } else if (nums1[cnt1] < nums2[cnt2]) {
                arr[temp] = nums1[cnt1];
                cnt1++;
            } else {
                arr[temp] = nums2[cnt2];
                cnt2++;
            }
            temp++;
        }

        return arr.length % 2 != 0 ? arr[arr.length / 2] : (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / (double) 2;
    }

    public static void main(String[] args) {

        int nums1[] = {1, 3};
        int nums2[] = {2, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}

package arrays;

public class LargestElement {

    // Naive solution, TC = O(n2)
    static int getLargest(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }

    //Better solution
    static int getLargest2(int arr[]) {

        int res = 0;
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > arr[res])
                res = i;

        return res;
    }

    public static void main(String[] args) {

        int arr[] = {10, 5, 20, 8};
        System.out.println(getLargest(arr));

        System.out.println(getLargest2(arr));
    }
}

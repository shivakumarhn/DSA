package arrays;

public class LeaderInAnArray {

    //TC = O(n2) and AS = O(1)
    static void leader(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] <= arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println(arr[i]);
        }
    }

    //TC = O(n) and AS = O(n)
    static void leader2(int arr[]) {

        int n = arr.length;
        int cur = arr[n - 1];
      //  System.out.println(cur);
        int[] temp = new int[n];
        temp[0]=cur;
        int count = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > cur) {
                cur = arr[i];
              //  System.out.println(arr[i]);
                count++;
                temp[count] = arr[i];
            }
        }
        for (int i = count; i >= 0; i--)
            System.out.println(temp[i]);
    }

    public static void main(String args[]) {

        int[] arr = {7, 10, 4, 10, 6, 5, 2, 6};
        leader2(arr);
    }
}

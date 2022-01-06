package gfg.arrays;

public class CountTheZeros {

    int countZeroes(int[] arr, int n) {
        // code here
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0)
                count++;
            else
                break;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 12;
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0};

        System.out.println(new CountTheZeros().countZeroes(arr, n));
    }
}

package bitmagic;

public class OddOccurringOfNumber {

    // Naive solution, TC = O(n2)
    static int findOdd(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] == arr[j])
                    count++;

            if (count % 2 != 0)
                return arr[i];
        }
        return 0;
    }

    //Efficient solution, TC = O(n) and AS = O(1)
    static int findOdd2(int[] arr, int n) {

        int res = 0;
        for (int i = 0; i < n; i++)
            res = res ^ arr[i];
        return res;
    }


    public static void main(String[] args) {

        int arr[] = {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
        System.out.println(findOdd(arr, n));
        System.out.println(findOdd2(arr, n));

       // int ar[] = {1, 4, 3}, m = 3;
        //System.out.println(findOdd3(ar, m));
    }
}

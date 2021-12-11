package arrays;

public class ArraySorted {

    //Naive solution, TC = O(n2)
    static boolean isSorted(int arr[], int n) {

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[i])
                    return false;
        return true;
    }

    //Efficient solution, TC = O(n)
    static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }


    public static void main(String[] args) {

        int arr[] = {7, 2, 30, 10}, n = 4;
        int arr2[] = {};
        System.out.println(isSorted(arr, n));
        System.out.println(isSorted(arr2));
    }
}

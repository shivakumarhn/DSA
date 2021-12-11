package arrays;

public class ArrayRevers {

    //TC = O(n)
    static void reverse(int arr[], int n) {

        int low = 0, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+ " ");
    }

    /*static int[] revevrse1(int arr[], int n){

        for (int i=0; i<n; i++){
            arr[i] = arr[(n-1) - i];
            arr[()]
        }
    }*/

    public static void main(String[] args) {

        int arr[] = {6, 11, 9, 16, 6};

        reverse(arr, arr.length);
    }
}

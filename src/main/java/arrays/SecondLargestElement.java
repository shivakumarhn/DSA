package arrays;

public class SecondLargestElement {

    //Naive solution, TC = O(n2)
    static int secondLargest(int arr[]) {
        int largest = getLargest(arr);
        int res = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) {
                if (res == -1)
                    res = i;
                else if (arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }


    static int getLargest(int arr[]) {
        int n = arr.length;
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest])
                largest = i;
        }
        return largest;
    }

    //Better solution, TC = 0(n) and AS = 0(1)
    static int getSecondLargest(int arr[]) {

        int n = arr.length;
        int res = -1, largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[largest]) {
                res = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (res == -1 || arr[i] > arr[res])
                    res = i;
            }

            /*My solution which also works
            if (res == -1 || (arr[i] < arr[largest] && arr[i] > arr[res]))
                res = i;*/
        }
        return res;
    }


    public static void main(String[] args) {

        int arr[] = {5, 20, 12, 20, 10};
        System.out.println(secondLargest(arr));
        System.out.println(getSecondLargest(arr));
    }
}

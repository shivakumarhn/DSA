package arrays;

public class FrequencyInSortedArray {

    //TC = 0(n) and AS=0(1)
    static void frequency(int arr[]) {

        int n = arr.length;

       /* HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<n; i++)
           h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);

           System.out.println(h);*/
        int count = 1;
        int i;
        for (i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.println(arr[i - 1] + "-->" + count);
                count = 1;
            } else {
                count++;
            }
        }
        if (i == n)
            System.out.println(arr[i - 1] + "-->" + count);
    }

    static void frequency2(int arr[]) {

        int i = 1, fre = 1, n = arr.length;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                fre++;
                i++;
            }
            System.out.println("Frequency of " + arr[i - 1] + " is " + fre);
            fre = 1;
            i++;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2])
            System.out.println("Frequency of " + arr[n - 1] + " is " + fre);
    }

    public static void main(String args[]) {

        int[] arr = {10, 10, 10, 25, 30, 30};
        int[] arr2 = {10, 10, 10, 10};
        int[] arr3 = {10, 20, 30};

        frequency(arr);
        frequency(arr2);
        frequency(arr3);

        frequency2(arr);
        frequency2(arr2);
        frequency2(arr3);

    }
}

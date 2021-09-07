package arrays;

public class ArrayOperations {

    // Search, TC = O(n)
    static int search(int arr[], int n, int x) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    // Insert, TC = O(n) -> To insert at pos=1 and TC = 0(1) -> To insert at pos=end
    static int insert(int arr[], int n, int x, int cap, int pos) {

        if (n == cap)
            return n;
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--)
            arr[i + 1] = arr[i];
        arr[idx] = x;
        return n + 1;
    }

    // Delete, TC = O(n)
    static int delete(int arr[], int n, int x) {

        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == x)
                break;

        if (i == n)
            return n;

        for (int j = i; j < n - 1; j++)
            arr[j] = arr[j + 1];
        return (n - 1);
    }


    public static void main(String[] args) {

        int arrS[] = {20, 5, 7, 25};
        System.out.println(search(arrS, arrS.length, 5));
        System.out.println(search(arrS, arrS.length, 15));

        int arrI[] = new int[5], cap = 5, n = 3;
        arrI[0] = 5;
        arrI[1] = 10;
        arrI[2] = 20;

        System.out.println("Before insertion");
        for (int i = 0; i < n; i++)
            System.out.print(arrI[i] + " ");
        int x = 7, pos = 2;
        System.out.println();

        n = insert(arrI, n, x, cap, pos);

        System.out.println("after insertion");
        for (int i = 0; i < n; i++)
            System.out.print(arrI[i] + " ");
        System.out.println();

        int arrD[] = {3, 8, 12, 5, 6};
        x = 12;
        n = 5;

        System.out.println("Before deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arrD[i] + " ");
        System.out.println();

        n = delete(arrD, n, x);

        System.out.println("After deletion");
        for (int i = 0; i < n; i++)
            System.out.print(arrD[i] + " ");

    }
}

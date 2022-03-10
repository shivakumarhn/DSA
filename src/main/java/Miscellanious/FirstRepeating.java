package Miscellanious;

public class FirstRepeating {

    static int firstRepeat(int arr[]) {

        int n = arr.length;
        int repeated = n;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[i] == arr[j] && j < repeated) {
                    repeated = j;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++)
            if (arr[i] == arr[repeated])
                return i;

        return -1;
    }


    static int firstRepeating(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] == arr[j])
                    return i;
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 3, 6};
        //int arr[] = {1, 2, 3, 4, 5, 1, 4};

        System.out.println(firstRepeat(arr));
        System.out.println(firstRepeating(arr));
    }
}

/*
  i = 0 --> j = 6
  i = 1
  i = 3
  i = 4 --> j = 4


  i = 0 --> j = 5
  i = 4 --> j = 6

 */
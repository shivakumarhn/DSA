package Matrix;

public class RotateMatrixAntiClockBy90 {

    // TC = 0(n2) and AS = 0(n*n)
    public static void rotate90AntiClock(int arr[][]) {

        int temp[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                temp[arr[i].length - j - 1][i] = arr[i][j];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    // TC = 0(n2) and AS = 0(n*n)
    public static void rotate90AntiClockEfficient(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int low = 0, high = arr.length - 1;
            while (low < high) {
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
            }
        }

    }


    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotate90AntiClock(arr);
    }
}

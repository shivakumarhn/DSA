package Matrix;

public class MatrixInSnakePattern {


    // TC = O[r][c] and AS = 0(1)
    public static void snake(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    // My Solution
    public static void snake1(int arr[][]) {

        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                j = 0;
                k = arr[i].length;
            } else {
                j = arr[i].length - 1;
                k = -1;
            }
            while (j != k) {
                System.out.print(arr[i][j] + " ");
                if (i % 2 == 0)
                    j++;
                else
                    j--;
            }
        }

    }

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        snake(arr);

    }
}

package Matrix;

import java.util.Arrays;

public class TransposeOfMatrix {

    // Naive solution
    public static void transpose(int arr[][]) {

        int temp[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                temp[i][j] = arr[j][i];

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                arr[i][j] = temp[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Efficient solution
    public static void transpose1(int arr[][]) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
    }


    public static void main(String[] args) {


        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        transpose1(arr);
        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }
}

package Matrix;

public class BoundaryTraversalOfMatrix {

    //TC = 0(r+c)
    public static void boundaryTraversal(int arr[][]) {

        if (arr.length == 1) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[0][j] + " ");
        } else if (arr[0].length == 1) {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i][0] + " ");
        } else {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[0][j] + " ");
            for (int i = 1; i < arr.length; i++)
                System.out.print(arr[i][arr[i].length - 1] + " ");
            for (int j = arr[arr.length - 1].length - 2; j >= 0; j--)
                System.out.print(arr[arr.length - 1][j] + " ");
            for (int i = arr.length - 2; i > 0; i--)
                System.out.print(arr[i][0] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        // int arr[][] = {{1, 2, 3, 4}};
        // int arr[][] = {{1}, {2}, {3}, {4}};

        boundaryTraversal(arr);
    }
}

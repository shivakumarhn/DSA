package recursion;

public class RopeCuttingProblem {

    //TC = 0(3TothePowerOfn => Pow(3, n))
    static int maxPieces(int n, int a, int b, int c) {

        if (n == 0) return 0;
        if (n < 0) return -1;

        int res = Math.max(maxPieces(n - a, a, b, c), Math.max(maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c)));

        if (res == -1)
            return -1;

        return res + 1;
    }

    //My wrong solution
    static int maxPieces2(int n, int a, int b, int c) {

        if (n == 0) return 1;
        if (n < 0) return 0;

        return maxPieces(n - a, a, b, c) + maxPieces(n - b, a, b, c) + maxPieces(n - c, a, b, c);
    }


    public static void main(String[] args) {

        int n = 5, a = 2, b = 5, c = 1;
        int m = 23, x = 11, y = 9, z = 12;
        int o = 9, p = 2, q = 2, r = 2;

        System.out.println(maxPieces(n, a, b, c));
        System.out.println(maxPieces(m, x, y, z));
        System.out.println(maxPieces(o, p, q, r));

        System.out.println("=====================");

        System.out.println(maxPieces2(n, a, b, c));
        System.out.println(maxPieces2(m, x, y, z));
        System.out.println(maxPieces2(o, p, q, r));
    }
}

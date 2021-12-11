package recursion;

public class FactorialUsingTailRecursion {

    // TC = less compare to non tail recursive and AC = 0(1)// converting factorial function to tail recursive
    static int fact(int n, int k) {

        if (n == 0 || n == 1)
            return k;
        return fact(n - 1, k * n);
    }


    public static void main(String[] args) {

        int n = 4;

        System.out.println(fact(n, 1));

    }
}

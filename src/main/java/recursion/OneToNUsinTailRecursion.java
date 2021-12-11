package recursion;

public class OneToNUsinTailRecursion {

    // TC = less compare to non tail recursive and AC = 0(1)// converting 1 to n function to tail recursive
    static void print1toN(int n, int k) {

        if (n == 0)
            return;

        System.out.println(k + " ");
        print1toN(n - 1, k + 1);
    }


    public static void main(String[] args) {

        int n = 5;

        print1toN(n, 1);
    }
}

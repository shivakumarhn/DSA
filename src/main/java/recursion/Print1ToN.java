package recursion;

public class Print1ToN {


    // TC = 0(n) and AC = 0(1)
    static void print1ToN(int n) {

        if (n == 0)
            return;
        print1ToN(n - 1);
        System.out.println(n + " ");
    }


    public static void main(String[] args) {

        int n = 5;

        print1ToN(n);
    }
}

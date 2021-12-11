package recursion;

public class PrintNTO1 {

    // TC = 0(n) and AC = 0(1)
    static void printNto1(int n) {

        if (n == 0)
            return;
        System.out.println(n + " ");
        printNto1(n - 1);
    }


    public static void main(String[] args) {

        int n = 5;

        printNto1(n);
    }
}

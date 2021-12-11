package mathematics;

public class IterativePower {

    // Iterative solution, TC = O(log(n)) and AS = O(1)
    static int power(int x, int n) {

        int res = 1;
        while (n > 0) {
            if (n % 2 != 0)
                res = res * x;
            x = x * x;
            n = n / 2;
        }
        return res;
    }


    public static void main(String[] args) {

        int x = 4, n = 5;

        System.out.print(power(x, n));
    }
}

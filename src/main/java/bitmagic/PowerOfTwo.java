package bitmagic;

public class PowerOfTwo {

    // Naive solution,
    static boolean isPow2(int n) {

        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    //Brain kerningam’s algorithm since 2 powers has only 1 bit set,TC = 0(set bit count)

    //Efficient method,
    static boolean isPow2a(int n) {

        if (n == 0)
            return false;

        return ((n & (n - 1)) == 0);
    }

    // My Solution
    static boolean isPow2b(int n) {

        if (n % 2 == 0) {
            if (n / 2 % 2 == 0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.println(isPow2(n));
        System.out.println(isPow2a(n));
        System.out.println(isPow2b(n));
    }
}

package bitmagic;

public class CountSetBits {

    // Naive solution, TC = 0(Total number of bits)
    static int countSetBits(int n) {

        int res = 0;
        while (n > 0) {
            if (n % 2 != 0) // Or ((n&1) == 1) Or res = res + (n&1);
                res++;
            n = n / 2;
        }
        return res;
    }


    //Brain kerningam’s algorithm, TC = 0(set bit count)
    static int countSetBits2(int n) {

        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }
        return res;
    }


    // Lookup table method for 32-bit numbers, TC = 0(1)
    static int table[] = new int[256];

    static void initialize() {
        table[0] = 0;
        for (int i = 1; i < 256; i++)
            table[i] = (i & 1) + table[i / 2];
    }

    static int countSetBits3(int n) {

        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        return res;
    }


    public static void main(String[] args) {

        int n = 9;
        System.out.println(countSetBits(n));
        System.out.println(countSetBits2(n));
        initialize();
        System.out.println(countSetBits3(n));

    }
}

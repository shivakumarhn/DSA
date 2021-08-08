package bitmagic;

public class KthBitSetOrNot {


    // Method 1 (Using Left Shift)
    static void kthBit(int n, int k) {
        if ((n & (1 << (k - 1))) != 0)
            System.out.println("yes, it is Set");
        else
            System.out.println("No, it is not set");
    }


    // Method 2 (Using Right Shift)
    static void kthBit2(int n, int k) {
        if (((n << (k - 1)) & 1) != 0)
            System.out.println("yes, it is Set");
        else
            System.out.println("No, it is not set");
    }


    public static void main(String[] args) {

        int n = 5, k = 3;
        kthBit(n, k);

        n = 13;
        k = 3;
        kthBit(n, k);

    }
}

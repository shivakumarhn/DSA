package mathematics;

public class Prime {

    // Naive solution,TC = O(n-2)=> O(n)
    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Efficient method, TC = O(root(n))
    static boolean isPrime2(int n) {

        if (n == 1)
            return false;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // More efficient method, 3 times quicker than previous method
    static boolean isPrime3(int n) {

        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return false;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 65;

        System.out.println(isPrime(n));
        System.out.println(isPrime2(n));
        System.out.println(isPrime3(n));
    }
}

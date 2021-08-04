package mathematics;

public class PrimeFactors {

    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Naive solution, TC = O(nlog(n))
    static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }

    }

    // Efficient method,
    static void primeFactors2(int n) {

        if (n <= 1)
            return;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1)
            System.out.print(n + " ");

        System.out.println();
    }

    // More efficient method,TC = O(root(n))
    static void primeFactors3(int n) {

        if (n <= 1)
            return;

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n / 3;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n = n / (i + 2);
            }
        }

        if (n > 3)
            System.out.print(n + " ");

        System.out.println();

    }


    public static void main(String[] args) {

        int n = 12;
        primeFactors(n);
        System.out.println();

        int m = 450;
        primeFactors2(m);

        int o = 550;
        primeFactors3(o);
    }
}

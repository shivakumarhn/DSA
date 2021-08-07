package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    // Naive solution, TC = o(n*root(n))

    static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }

        System.out.println();
    }

    //Supporting function
    static boolean isPrime(int n) {

        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return false;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

// Optimised implementation

    static void sieve(int n) {

        if (n <= 1)
            return;

        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i])
                for (int j = 2 * i; j <= n; j = j + i)
                    isPrime[j] = false;
        }
        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                System.out.print(i + " ");
        }

        System.out.println();
    }


// Optimised implementation of Sieve [just reduces few lines of code, not TC]

    static void sieve2(int n) {

        if (n <= 1)
            return;

        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i + " ");
                for (int j = i * i; j <= n; j = j + i)
                    isPrime[j] = false;
            }
        }

    }


    public static void main(String[] args) {

        int n = 16;

        printPrimes(n);
        sieve(n);
        sieve2(n);

    }
}

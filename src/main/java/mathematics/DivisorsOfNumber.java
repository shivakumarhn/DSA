package mathematics;

public class DivisorsOfNumber {

    // Naive solution, TC = o(n))
    static void primeDivisors(int n) {

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
        System.out.println();
    }


    // Efficient method, Tc = 0(root(n))
    static void primeDivisors2(int n) {

        for (int i = 1; i * i <= n; i++)
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i)
                    System.out.print(n / i + " ");
            }
        System.out.println();
    }


    // Efficient method, with sorted order, TC = 0(root(n)) and AS = 0(1)
    static void primeDivisors3(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        for (; i >= 1; i--) {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }


    public static void main(String[] args) {

        int n = 15;

        primeDivisors(n);
        primeDivisors2(n);
        primeDivisors3(n);

    }
}

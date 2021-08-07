package mathematics;

public class ComputePower {

    // Naive solution, TC = 0(n)
    static int power(int x, int n) {

        int res = 1;

        for (int i = 0; i < n; i++)
            res = res * x;
        return res;
    }


    // Recursive solution, TC = O(n) AS = O(log(n))

    static int power2(int x, int n) {

        if (n == 0)
            return 1;

        int temp = power2(x, n / 2);
        temp = temp * temp;

        if (n % 2 == 0)
            return temp;
        else
            return temp * x;
    }


    public static void main(String[] args) {

        int x = 3, n = 5;

        System.out.println(power(x, n));
        System.out.println(power2(x, n));
    }
}

package mathematics;

public class TrailingZerosOfFactorial {

    int countZeros(int n) {

        // Naive method TC = 0(n)
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        System.out.println(fact);
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;

    }

    // Efficient solution and solves overflow, TC = 0(logn)
    int countZeros2(int n) {
        int res = 0;
        for (int i = 5; i <= n; i = i * 5)
            res = res + n / i;
        return res;
    }


    public static void main(String[] args) {

        TrailingZerosOfFactorial trailing = new TrailingZerosOfFactorial();
        int zeros = trailing.countZeros(10);
        System.out.println(zeros);
    }
}

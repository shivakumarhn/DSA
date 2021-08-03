package mathematics;

public class Factorial {

    // Iterative method, TC = 0(n)
   static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    // Recursive method, TC = 0(n) and AS = 0(n) [since it stores n function stacks]
    static int factorial2(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void main(String[] args) {

        int fact = factorial(5);
        int facto = factorial2(6);
        System.out.println(fact);
        System.out.println(facto);
    }

}

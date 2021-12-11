package recursion;

public class FibanacciUsingRecursion {

    //0, 1, 1, 2, 3, 5, 8.... and 0th position->0, 1-1, 2-1, 3-2, 4-3
    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {

        int n = 4;

        System.out.println(fib(n));

    }

}

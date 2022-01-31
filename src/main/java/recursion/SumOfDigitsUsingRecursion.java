package recursion;

public class SumOfDigitsUsingRecursion {

    //TC = 0(d) and AS = 0(d)
    static int getSum(int n) {

        if (n <= 9)
            return n;

        return getSum(n / 10) + n % 10;
    }

//Iterative is always better over recursion if it is simple implementation sice AS = 0(1)
    static int getSumIterative(int n) {
        int res = 0;

        while (n > 0) {
            res = res + n % 10;
            n = n / 10;
        }
        return res;
    }


    public static void main(String[] args) {

        System.out.println(getSum(253));
        System.out.println(getSumIterative(3500));
    }
}

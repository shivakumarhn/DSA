package recursion;

public class SumOfNaturalNumbers {

    //TC = 0(n) and AS = 0(n)
    static int getSum(int n) {
        if (n == 0)
            return 0;

        return n + getSum(n - 1);
    }


    public static void main(String[] args) {

        int n = 4;

        System.out.println(getSum(n));
    }
}

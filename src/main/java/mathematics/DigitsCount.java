package mathematics;

import java.util.Scanner;

public class DigitsCount {

    //Iterative solution, TC = 0(d) for d digits in integer
    int countDigits(int n) {
        int res = 0;
        System.out.println("Loop starts");
        while (n != 0) {
            n = n / 10;
            res++;
        }
        System.out.println("Loop ends");
        return res;
    }

    //Recursive solution,
    int countDigits2(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    //Logarithmic solution, TC = 0(1)
    int countDigits3(int n) {
        return (int) Math.floor(Math.log10(n) + 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for digits count");
        int n = scanner.nextInt();
        DigitsCount digits = new DigitsCount();

        long start = System.currentTimeMillis();
        digits.countDigits(n);
        long end = System.currentTimeMillis();

        System.out.println("Time taken for iterative solution " + (end - start) + "ms");

        int i = digits.countDigits(n);
        int r = digits.countDigits2(n);
        int l = digits.countDigits3(n);
        System.out.println("Iterative Digits count of number " + n + " is " + i);
        System.out.println("Recursive Digits count of number " + n + " is " + r);
        System.out.println("Logarithmic Digits count of number " + n + " is " + l);

    }


}


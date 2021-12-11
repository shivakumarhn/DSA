package mathematics;

public class Palindrome {

    // TC = 0(d) for d digits in input integer
    boolean isPal(int n) {
        int rev = 0;
        int temp = n;

        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (temp == n);
    }


    public static void main(String[] args) {

        Palindrome pal = new Palindrome();
        boolean pali = pal.isPal(2333);
        boolean notPoli = pal.isPal(678);
        System.out.println(pali);
        System.out.println(notPoli);
    }

}

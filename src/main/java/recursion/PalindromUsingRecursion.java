package recursion;

public class PalindromUsingRecursion {

    //TC = O(n) and AS = O(n/2)=> O(n)
    static boolean isPalindrom(String str, int start, int end) {

        if (start >= end)
            return true;

        return ((str.charAt(start) == str.charAt(end) && isPalindrom(str, start + 1, end - 1)));
    }

    public static void main(String[] args) {

        String str = "GeekskeeG";

        System.out.println(isPalindrom(str, 0, str.length() - 1));
    }

}

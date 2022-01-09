package strings;

public class Palindrome {

    static boolean palindrome(String str) {

        int n = str.length();
        String rev = "";

        for (int i = n - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        return rev.equals(str);
    }

    //TC = O(n) & AS=(n)
    static boolean palindrome2(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.equals(str);
    }

    static boolean palindrome3(String str) {

        int begin = 0, end = str.length() - 1;

        while (begin < end) {

            if (str.charAt(begin) != str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }


    public static void main(String args[]) {

        System.out.println(palindrome3("ABCDCBA"));
        System.out.println(palindrome3("geeks"));
        System.out.println(palindrome3("ABCDCBA"));
        System.out.println(palindrome3("eeabee"));
    }
}

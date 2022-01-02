package strings;

import java.util.Arrays;

public class PrintExtraCharInFirstString {

    static char extraChar(String s1, String s2) {

        StringBuilder sb = new StringBuilder(s1);

        for (int i = 0; i < s2.length(); i++) {
            if (sb.indexOf(String.valueOf(s2.charAt(i))) < 0)
                return s2.charAt(i);
            else
                sb.deleteCharAt(sb.indexOf(String.valueOf(s2.charAt(i))));
        }
        return ' ';
    }

    static char extraCharNaive(String s1, String s2) {

        for (int i = 0; i < s2.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s2.charAt(i)) {
                    s1 = s1.replace(s1.charAt(j), '.');
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                return s2.charAt(i);
        }
        return ' ';
    }

    //TC =O(nLogn) and AS = O(n)
    static char extraCharUsingSort(String s1, String s2) {

        char a[] = s1.toCharArray();
        Arrays.sort(a);
        char b[] = s2.toCharArray();
        Arrays.sort(b);

        int n = s1.length();
        for (int i = 0; i < n; i++)
            if (a[i] != b[i])
                return b[i];
        return b[n];
    }

    static char extraCharUsingBitwise(String s1, String s2) {

        int res = 0;
        int n = s1.length();

        for (int i = 0; i < n; i++)
            res = res ^ s1.charAt(i) ^ s2.charAt(i);

        res = res ^ s2.charAt(n);
        return (char) res;
    }


    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "acba";

        System.out.println(extraChar(s1, s2));
        System.out.println(extraCharNaive(s1, s2));
        System.out.println(extraCharUsingSort(s1, s2));
        System.out.println(extraCharUsingBitwise(s1, s2));

    }
}

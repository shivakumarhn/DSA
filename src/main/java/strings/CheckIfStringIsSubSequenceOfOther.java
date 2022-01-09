package strings;

public class CheckIfStringIsSubSequenceOfOther {

    static boolean subSequence(String s1, String s2) {

        int n = s1.length();
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.println(s1.charAt(i));
            for (int j = i + 1; j < n; j++) {
                System.out.println(s1.charAt(i) + "" + s1.charAt(j));
                for (int k = j + 1; k < n; k++) {
                    System.out.println(s1.charAt(i) + "" + s1.charAt(j) + "" + s1.charAt(k));
                    for (int l = k + 1; l < n; l++) {
                        System.out.println(s1.charAt(i) + "" + s1.charAt(j) + "" + s1.charAt(k) + "" + s1.charAt(l));
                    }
                }
            }
        }
        return true;
    }

    //TC n(n+m) & AS = O(1) own solution
    static boolean subSequence2(String s1, String s2) {

        int n = s1.length(), m = s2.length();
        int j = 0;
        for (int i = 0; i < n && j < m; i++)
            if (s1.charAt(i) == s2.charAt(j))
                j++;
        return (m == j);
    }

    //TC n(n+m) & AS = O(n+m) own solution
    static boolean subSequenceRecursive(String s1, String s2, int n, int m) {


        if (m == 0)
            return true;
        if (n == 0)
            return false;

        if (s1.charAt(n - 1) == s2.charAt(m - 1))
            return subSequenceRecursive(s1, s2, n - 1, m - 1);
        else
            return subSequenceRecursive(s1, s2, n - 1, m);
    }

    //TC n(n+m) & AS = O(1) own solution
    static boolean subSequence3(String s1, String s2) {

        int str = s1.length();
        int seb = s2.length();
        int i = 0, j = 0;
        while (i < str && j < seb) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
                if (j == seb)
                    return true;
            } else i++;


        }
        return false;
    }


    public static void main(String args[]) {

        String str = "ABCD";  //"", A, AB, ABC, ABD, ABCD, AC, ACD, AD, B, BC, BD, BCD, C, CD, D
        String sec = "CB";
        System.out.println(subSequence2(str, sec));
        System.out.println(subSequenceRecursive(str, sec, str.length(), sec.length()));
    }
}

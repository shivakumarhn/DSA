package strings;

import java.util.Arrays;

public class Anagram {

    static boolean anagram(String s1, String s2) {

        StringBuilder sb = new StringBuilder(s1);

        for (int i = 0; i < s2.length(); i++) {
            if (sb.indexOf(String.valueOf(s2.charAt(i))) < 0)
                return false;
            else
                sb.deleteCharAt(sb.indexOf(String.valueOf(s2.charAt(i))));
        }
        return true;
    }

    //TC = O(Log(n))
    static boolean anagramBit(String s1, String s2) {

        int res = 0;
        int n = s1.length();

        for (int i = 0; i < n; i++)
            res = res ^ s1.charAt(i) ^ s2.charAt(i);
        if (res == 0)
            return true;
        else
            return false;
    }

    static boolean anagramSort(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);

        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);

        s2 = new String(a2);

        if (s1.equals(s2))
            return true;
        else
            return false;
    }

    //TC = O(n+CHAR) and AS = O(1)
    static boolean anagramUsingAscii(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] visited = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            visited[s1.charAt(i)]++;
            visited[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++)
            if (visited[i] != 0)
                return false;
        return true;
    }


    public static void main(String[] args) {

        String s1 = "aaacb";
        String s2 = "cabaa";

        System.out.println(anagram(s1, s2));
        System.out.println(anagramBit(s1, s2));
        System.out.println(anagramSort(s1, s2));
        System.out.println(anagramUsingAscii(s1, s2));

    }
}

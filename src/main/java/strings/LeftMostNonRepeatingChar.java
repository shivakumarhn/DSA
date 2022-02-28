package strings;

import java.util.Arrays;

public class LeftMostNonRepeatingChar {

    //TC = O(n2) and AS = O(1)
    static int leftMostNonRepeatingChar(String s) {

        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return i;
        }
        return -1;
    }


    //TC = O(n) and AS = O(1) Better approach
    static int leftMostNonRepeatingChar1(String s) {

        int n = s.length();
        int[] count = new int[256];

        for (int i = 0; i < n; i++)
            count[s.charAt(i)]++;

        for (int i = 0; i < n; i++)
            if (count[s.charAt(i)] == 1)
                return i;

        return -1;
    }

    //TC = O(n) and AS = O(char) efficient one traversal
    static int leftMostNonRepeatingChar3(String s) {

        int n = s.length();
        int[] count = new int[256];
        Arrays.fill(count, -1);
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i)] == -1)
                count[s.charAt(i)] = i;
            else
                count[s.charAt(i)] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++)
            if (count[i] >= 0)
                res = Math.min(res, count[i]);
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    //TC = O(n2) and AS = O(1) My solution
    static int leftMostNonRepeatingChar4(String s) {

        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                return i;
        }
        return -1;
    }

    //TC = O(n) and AS = O(1) My solution
    static int leftMostNonRepeatingChar5(String s) {

        int n = s.length();

        for (int i = 1; i < n; i++)
            if (s.indexOf(s.charAt(i - 1), i) < 0)
                return i - 1;
        return -1;
    }

    public static void main(String args[]) {

        String str1 = "geeksforgeeks";
        String str2 = "apple";
        String str3 = "abcabc";
        System.out.println(leftMostNonRepeatingChar5(str1));
        System.out.println(leftMostNonRepeatingChar5(str2));
        System.out.println(leftMostNonRepeatingChar5(str3));
    }
}

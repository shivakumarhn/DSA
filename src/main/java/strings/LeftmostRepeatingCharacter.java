package strings;

import java.util.Arrays;

public class LeftmostRepeatingCharacter {

    //TC = O(n2)
    static int leftMostRepeatingChar(String s1) {

        int n = s1.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s1.charAt(i) == s1.charAt(j))
                    return i;
            }
        }
        return -1;
    }

    //Better approach TC = O(n) and TC = O(CHAR)
    static int leftMostRepeatingChar1(String s1) {

        int n = s1.length();
        int count[] = new int[256];

        for (int i = 0; i < n; i++)
            count[s1.charAt(i)]++;

        for (int i = 0; i < n; i++)
            if (count[s1.charAt(i)] > 1)
                return i;
        return -1;
    }

    //Efficient one TC = O(n + CHAR) & AS = O(CHAR)
    static int leftMostRepeatingChar2(String s1) {

        int n = s1.length();
        int count[] = new int[256];
        Arrays.fill(count, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int fil = count[s1.charAt(i)];
            if (fil == -1)
                count[s1.charAt(i)] = i;
            else
                res = Math.min(res, fil);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    //Efficient two TC = O(n + CHAR) & AS = O(CHAR)
    static int leftMostRepeatingChar3(String s1) {

        int n = s1.length();
        boolean visited[] = new boolean[256];
        int res = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (visited[s1.charAt(i)] != true)
                visited[s1.charAt(i)] = true;
            else
                res = i;
        }
        return res;
    }

    //O(n) my solution
    static int leftMostRepeatingChar4(String s1) {

        int n = s1.length();
        for (int i = 1; i < n; i++)
            if (s1.indexOf(s1.charAt(i - 1), i) > 0)
                return i - 1;
        return -1;
    }

    public static void main(String[] args) {

        String s1 = "abcdefggfe";
        System.out.println(leftMostRepeatingChar(s1));
        System.out.println(leftMostRepeatingChar1(s1));
        System.out.println(leftMostRepeatingChar2(s1));
        System.out.println(leftMostRepeatingChar3(s1));
        System.out.println(leftMostRepeatingChar4(s1));
    }
}

package strings;

import java.util.Arrays;
import java.util.HashSet;

public class Panagram {

    static boolean panagram1(String s) {

        int n = s.length();
        if (n < 26)
            return false;

        boolean[] visited = new boolean[26];
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if (x >= 'a' && x <= 'z')
                visited[x - 'a'] = true;
            if (x >= 'A' && x <= 'Z')
                visited[x - 'A'] = true;
        }

        for (int i = 0; i < 26; i++)
            if (visited[i] == false)
                return false;

        return true;
    }


    static boolean panagram2(String s) {

        char[] chr = s.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(chr);
        System.out.println(Arrays.toString(chr));

        HashSet<Character> ls = new HashSet<>();
        for (int i = 0; i < chr.length; i++)
            ls.add(chr[i]);
        System.out.println(ls.size());

        System.out.println(ls);
        if (ls.size() >= 26)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(panagram1("The quick brown fox jumps over the lazy dog"));
        System.out.println(panagram2("The quick brown fox jumps over the lazy dog"));
    }
}

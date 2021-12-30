package pramp;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Pangram {


    static boolean pangram(String s) {

        char[] chr = s.toLowerCase().replaceAll("\\s", "").toCharArray();
        Arrays.sort(chr);
        System.out.println(Arrays.toString(chr));

        LinkedHashSet<Character> ls = new LinkedHashSet<>();

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

        System.out.println(pangram("The quick brown fox jumps over the lazy dog"));
    }
}

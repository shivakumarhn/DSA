package Miscellanious;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RollCharInStringClumino {

    public static String rollString(String str, int roll[]) {

        Map<Integer, Character> map = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            map.put(i, (char) (i + 96));
        }

        char ch[] = str.toCharArray();
        for (int i = 0; i < roll.length; i++) {
            for (int j = 0; j < roll[i]; j++) {
                ch[j] = rotateChar(ch[j], 1);
            }
        }

        return String.valueOf(ch);
    }


    public static Character rotateChar(Character ch, int rotate) {

        Map<Integer, Character> map = new HashMap<>();
        for (int i = 1; i < 27; i++) {
            map.put(i, (char) (i + 96));
        }

        int key = (int) (ch - 96);

        if (key == 26)
            key = 0;

        // System.out.println(map.get(key+rotate));
        return map.get(key + rotate);
    }


    public static void main(String args[]) {

        String s = "abz";
        int roll[] = {3, 2, 1};

        String res = rollString(s, roll);
        System.out.println(res);
    }
}
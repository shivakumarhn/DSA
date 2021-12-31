package pramp;

import java.util.Hashtable;
import java.util.Map;

public class MaxRepeatedCharsInStringOracle {


    static void maxCharCount(String str) {

        Hashtable<Character, Integer> maxChar = new Hashtable<>();
        str = str.replaceAll("\\s", "");
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (maxChar.containsKey(str.charAt(i)))
                maxChar.put(str.charAt(i), maxChar.get(str.charAt(i)) + 1);
            else
                maxChar.put(str.charAt(i), 1);
        }

        //This is sample program

        for (Map.Entry ch : maxChar.entrySet()) {
            int max = (int) ch.getValue();
            System.out.println(ch.getKey() + " " + ch.getValue());
        }

    }

    public static void main(String[] args) {

        String s = "This is sample program";
        maxCharCount(s);

    }


}

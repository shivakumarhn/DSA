package pramp;

import java.util.regex.Pattern;

public class WordsCharacterReversInStringPunnam {

    static String charReversInWord(String s) {

        String[] words = s.trim().split("\\s+");

        String ans = "";

        for (String str : words) {
            String spe = "";
            for (int i = str.length(); i > 0; i--) {
                if (Pattern.matches("[\\W]", Character.toString(str.charAt(i - 1))))
                    spe = spe + str.charAt(i-1);
                else
                    ans = ans + str.charAt(i - 1);
            }
            if (spe.isEmpty())
                ans = ans + " ";
            else
                ans = ans + spe + " ";
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "how to do? in     java.";
        System.out.println(charReversInWord(s));
    }

}

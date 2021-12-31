package pramp;

import java.util.regex.Pattern;

public class ReverseWordsInStringPunnam {

    public String reverseWords(String s) {

        String[] str = s.split(" "); // or s.split("\\s+")
        String resStr = "";
        //System.out.println(Arrays.stream(str).toArray());
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) {
                String st = str[i].replaceAll("[\\w]", "");
                if (Pattern.matches("[\\W]", st))
                    str[i] = str[i].replaceAll("\\W", "");
                resStr = resStr + " " + str[i];
            }
        }
        System.out.println(resStr.trim());
        return resStr.trim();
    }

    public static void main(String[] args) {

        ReverseWordsInStringPunnam rev = new ReverseWordsInStringPunnam();
        //String s = "the sky is blue";
        String s = "how   to do? in java.";
        String r = rev.reverseWords(s);

    }

}

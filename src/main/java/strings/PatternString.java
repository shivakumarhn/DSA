package strings;

public class PatternString {

    static void patternString(String txt, String pat) {

        int pos = txt.indexOf(pat);
        while (pos >= 0) {
            System.out.println(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }

    static String patternStringForDigitsAfterDot(String txt) {

        int pos = txt.indexOf(".");
        if (pos >= 0)
            return txt.substring(pos+1);
        else
            return null;
    }

    public static void main(String[] args) {

        patternString("geeks for geeks", "geeks");
        System.out.println("=====================");
        patternString("aaaaa", "aaa");

        System.out.println("=====================");
        System.out.println(patternStringForDigitsAfterDot("12"));
    }
}

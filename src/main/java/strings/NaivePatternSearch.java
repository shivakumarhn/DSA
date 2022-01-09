package strings;

public class NaivePatternSearch {

    static void naivePattern(String s, String p) {

        int n = s.length(), m = p.length();
        for (int i = 0; i <= (n - m); i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i+j) != p.charAt(j))
                    break;
            }
            if (j == m)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {

        String s = "ABABABCD";
        String pat = "ABAB";

       naivePattern(s, pat);
    }
}

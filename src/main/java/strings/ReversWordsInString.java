package strings;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversWordsInString {


    static void reverse1(char str[], int low, int high) {
        while (low <= high) {
            //swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            //
            low++;
            high--;
        }
    }

    static void reverseWords1(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse1(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse1(str, start, n - 1);
        reverse1(str, 0, n - 1);
    }


    static String reverseWords(String str) {

        if (!str.contains(" "))
            return str;

        String[] s = str.split("\\s");
        String rev = "";
        for (int i = s.length - 1; i >= 0; i--)
            rev = new String(reverse(s[i].toCharArray(), 0, s[i].length() - 1)) + " " + rev;
        //rev = rev + " " +  String.valueOf(reverse(s[i].toCharArray(), 0, s[i].length() - 1));
        // rev = rev + " " +  String.copyValueOf(reverse(s[i].toCharArray(), 0, s[i].length() - 1));
        // rev = rev + " " + Stream.of(reverse(s[i].toCharArray(), 0, s[i].length() - 1))
        //     .map(arr -> new String(arr))
        //    .collect(Collectors.joining());

        return rev;
    }

    static char[] reverse(char s[], int start, int end) {
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        //  System.out.println(s);
        return s;
    }


    public static void main(String[] args) {
        String s = "welcome to gfg";
        char arr[] = s.toCharArray();
        reverseWords1(arr, s.length());
        System.out.println(arr);
        System.out.println(reverseWords(s));

    }
}

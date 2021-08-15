package recursion;

public class SubsetUsingRecursion {

    //curr = for string length zero and i is for adding each character
    static void subSet(String s, String curr, int i) {

        if (i == s.length()) {
            System.out.println(curr + " ");
            return;
        }

        subSet(s, curr, i + 1);
        subSet(s, curr + s.charAt(i), i + 1);
    }


    public static void main(String[] args) {

        String str = "ABC";

        subSet(str, "", 0);

    }
}

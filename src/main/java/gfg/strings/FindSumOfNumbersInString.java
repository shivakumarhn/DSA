package gfg.strings;

public class FindSumOfNumbersInString {

    static int findSum(String s) {

        String temp = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                temp += s.charAt(i);
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);

    }

    public static void main(String args[]) {

        String str = "12abc20yz68";

        System.out.println(findSum(str));
    }
}

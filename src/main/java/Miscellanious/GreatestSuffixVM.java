package Miscellanious;

import java.util.ArrayList;

public class GreatestSuffixVM {

    static void greaterSuffix(String s) {

        String[] w = s.split(",");
        ArrayList<String> list = new ArrayList<>();

        for (String suf : w)
            list.add(suf);

        list.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(list);

    }

    static void greaterSuffix2(String s) {

        String[] w = s.split(",");

        String low = "";
        for (int i = 1; i < w.length; i++) {
            if (w[i - 1].length() < w[i].length())
                low = w[i - 1];
            else
                low = w[i];
        }

        System.out.println(low);

        for (int i =0; i<low.length(); i++){

        }

    }

    public static void main(String[] args) {


        String s = "Automation, Execution, Calculation, Decoration, Solution";
        greaterSuffix2(s);

    }
}

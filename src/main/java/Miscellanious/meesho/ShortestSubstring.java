package Miscellanious.meesho;

import java.util.*;

public class ShortestSubstring {


    static String shortestDistinct(String s) {

        int n = s.length();

        int visited[] = new int[123];
        int count = 0;
        String out = "";

        for (int i = 0; i < n; i++) {
            if (visited[s.charAt(i)] == 0) {
                visited[s.charAt(i)]++;
                out = out + s.charAt(i);
                count++;
            }
        }

        System.out.println(count + " " + out);

        Set<String> list = new HashSet<>();

        int temp = count;
        for (int i = 0; i <= n - count; i++) {
            while (temp == s.length()){
                list.add(s.substring(i, temp));
                temp++;
            }
            temp = count;
        }

        System.out.println(list);

        for (String res : list) {
            boolean flag = true;
            int i;
            for (i = 0; i < out.length(); i++) {
                if (res.indexOf(out.charAt(i)) == -1) {
                    flag = false;
                    break;
                }
            }

            if (flag == true)
                return res;

            if (i == count)
                flag = false;
        }
        return " ";
    }


    public static void main(String[] args) {

        String s = "dabbcacbd";
        System.out.println(shortestDistinct(s));

        Root root = new Root();
        root.metadata.request_id = "rid";



    }

    /*
    s[] = { true, true, true true }
    s - dabbcacbd
    res = abcd
     */




}

package Miscellanious;

import java.util.*;

public class MultiDecimalApple {

    static void addition(String arr[], String key) {

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < arr.length; i++)
             set.add(Integer.parseInt(arr[i].replace(".", "")));
           // set.add(arr[i]);

        for (Integer i : set){
            if( i > Integer.parseInt(key.replace(".", "")) ){
                int n = i;
                String num = "";
                while ( n != 0){
                    i = i%10;
                    num = "." + num;
                    n = n/2;
                }
            }
                System.out.println(i%10);
        }


        System.out.println(set);
    }

    public static void main(String[] args) {


        String arr[] = {"3.2.1", "3.0.0", "3.0.1", "4.0.1", "3.9.1", "4.0.0"};

        String key = "3.1.0";
        addition(arr, key);

        //System.out.println(Double.valueOf(d));
    }
}

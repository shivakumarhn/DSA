package Miscellanious;

public class SortingOf3DistinctElementsVM {

    static boolean isAnagram(String s1, String s2) {


        if (s1.length() != s2.length())
            return false;
        int count[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++)
            if (count[i] > 0)
                return false;
        return true;
    }

    static void sort3DistinctElements(){

//        int lo

         /* int arr[] = {3, 3, 2, 1, 3, 2, 1};

    i = 0 => 3
    i = 6 => 1    3>1 = >

    low = 0
    high = 6
    min = 1;
        // {1, 1, 2, 2, 3, 3, 3}
        // {1,3,2,1,3,2,3}

        // {1, 2, 2, 1, 3, 3, 3}
        // {1, 1, 2, 2, 3, 3, 3}
        // {1, 1, 2, 2, 3, 3, 3}

         */

    }


    public static void main(String[] args) {


        String s1 = "for";
        String s2 = "ofr";

        System.out.println(isAnagram(s1, s2));




    }
}

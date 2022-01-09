package strings;

public class FrequenciesOfCharsInSortedOrder {

    static void maxSubArraySum(String str) {

        int n = str.length();
        int count[] = new int[26];

        for (int i = 0; i < n; i++)
            count[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (count[i] > 0)
                System.out.println((char) (i + 'a') + "-->" + count[i]);
    }


    public static void main(String args[]) {

        maxSubArraySum("geeksforgeeks");

    }
}

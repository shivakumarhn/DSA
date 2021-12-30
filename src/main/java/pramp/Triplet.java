package pramp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Triplet {


    static void triplet(int[] arr, int key) {

        int l = arr.length;
        boolean flag = false;
        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        System.out.println("Triplet is available " + arr[i] + " " + arr[j] + " " + arr[k]);
                        flag = true;
                        break;
                    }
                }
                if (flag)
                    break;
            }
            if (flag)
                break;
        }
        if (!flag)
            System.out.println("No triplet");

    }

    public static void main(String[] args) {

         /* int[] arr = {12, 3, 4, 1, 6, 9};
          triplet(arr, 24); */
        int[] arr = {1, 2, 3, 4, 5};
        triplet(arr, 9);
    }



        /*

        a) 1:1

           1. Check if upload button is available
           2. once you click on it, check if it is providing options to upload from local and one drive
           3. upload from local and check if it is uploaded successfully
           4. upload from one drive and check if it is uploaded successfully.(check for login)
           5. check if the recipient can see the file once it is uploaded
           6. check if it can be downloaded from recipient
           7. visible mode once recipient checks the file
           8. type of files can be uploaded
           9. if it can be deleted
           10. edit and replace
           11. make it unread
           12. sharing option from recipient

   b) teams channel
    1. All team members could be able to see and download
    2. it should be available under files tab once it is uploaded




         */


}

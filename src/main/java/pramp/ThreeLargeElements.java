package pramp;

public class ThreeLargeElements {

    static void thief(int[] arr){


        int n = arr.length;

        int firstLarge = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){

            if(arr[i] > firstLarge){
                third = secondLarge;
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i] > secondLarge && arr[i] != firstLarge){
                third = secondLarge;
                secondLarge = arr[i];
            }
            else if(arr[i] > third && arr[i] != secondLarge)
                third = arr[i];
        }

        System.out.println(firstLarge + " " + secondLarge + " " + third);
    }


    public static void main(String[] args) {

        int arr[] = {3, 7, 2, 5, 12, 30};
        int arr1[] = {8, 10, 2, 50, 80, 20};

        thief(arr);
        thief(arr1);
    }
}

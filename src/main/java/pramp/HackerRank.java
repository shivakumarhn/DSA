package pramp;

public class HackerRank {

    int a;
    double b;
    float c;
    long d;

    HackerRank() {
        System.out.println("int =  " + a);
        System.out.println("double =  " + b);
        System.out.println("float =  " + c);
        System.out.println("long =  " + d);

//        float out = ( this.a + this.d) * ( this.b + this.c);
        System.out.println(Float.class.isInstance((this.a + this.d) * (this.b + this.c)));

        System.out.println((this.a + this.d) * (this.b + this.c));
    }

    static void duplicates(int arr[]){

        int arr2[] = new int[arr.length];
        for (int i=0; i<arr.length; i++){
            if(arr[i]==arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];

            }
        }
    }
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 30, 30, 30, 30};
        duplicates(arr);

        new HackerRank();

    }
}

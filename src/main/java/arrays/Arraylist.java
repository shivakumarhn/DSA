package arrays;

import java.util.ArrayList;

public class Arraylist {


    public static void main(String[] args) {

        // Arraylist initialization with dynamic size
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        // Arraylist initialization with fixed capacity and it will take even more elements
        ArrayList<Integer> alFixed = new ArrayList<>(100);

        for (int i = 1; i <= 100; i++)
            alFixed.add(i);
        System.out.println(alFixed);

        // Arraylist initialization with minimum ensure capacity
        ArrayList<Integer> alEnsureCapacity = new ArrayList<>();
        alEnsureCapacity.ensureCapacity(100);

        for (int i = 1; i <= 200; i++)
            alEnsureCapacity.add(i);
        System.out.println(alEnsureCapacity);
    }


}

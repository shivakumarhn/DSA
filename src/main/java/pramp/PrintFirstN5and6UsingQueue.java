package pramp;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFirstN5and6UsingQueue {

    static void printFirstN(int n){

        Queue<String> q=new LinkedList<>();
        q.add("5");
        q.add("6");
        for(int i=0; i<n; i++){
            String cur = q.poll();
            System.out.print(cur+ " ");
            q.add(cur + "5");
            q.add(cur + "6");
        }
    }

    public static void main(String[] args) {

        printFirstN(100);
    }
}

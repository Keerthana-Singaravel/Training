package Day10.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerQueue {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");

        System.out.println("Queue : "+q);
        if(!q.isEmpty()){
            String s=q.poll();
            System.out.println("Serving :"+s);
        }

        if(!q.isEmpty()){
            System.out.println("Waiting : "+q);
        }
    }
}

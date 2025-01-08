package Day10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> m=new HashMap<String,Integer>();
        m.put("Alice",85);
        m.put("Bob",90);
        m.put("Charlie",88);

        System.out.println("enter the name to update mark:");
        String s=sc.nextLine();
        System.out.println("enter the mark to update:");
        int n=sc.nextInt();
        if(m.containsKey(s)){
            m.put(s,n);
        }
        System.out.println("All Students and marks:"+m);

        System.out.println("enter the name to get info:");
        String name=sc.next();
        if(m.containsKey(name)){
            System.out.println(name+" --> "+m.get(name));
        }

    }
}

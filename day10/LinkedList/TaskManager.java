package Day10.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<String> l=new LinkedList<String>();
        System.out.println("enter the tasks");
        while(true){
            String str=sc.nextLine();
            if(str.equals("0")){
                break;
            }
            l.add(str);
        }
        System.out.println("enter the task to remove:");
        String r=sc.nextLine();
        for(String s:l){
            if(r.equals(s)){
                l.remove(s);
            }
        }

        System.out.println("Task list : "+l);
    }
}

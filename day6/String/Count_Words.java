package Day6;

import java.util.Scanner;

public class Count_Words {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Sentence:");
        String str=sc.nextLine();
        String a[]=str.split(" ");
        System.out.println(a.length);
    }
}

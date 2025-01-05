package Day7;

import java.util.Scanner;

public class Count_Substring {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("enter the elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        int c=0;
        System.out.println("enter the string :");
        String str=sc.next();
        for(int i=0;i<n;i++){
            if(str.contains(a[i])){
                c++;
            }
        }
        System.out.println("No.of Strings in given word is "+c);
    }
}

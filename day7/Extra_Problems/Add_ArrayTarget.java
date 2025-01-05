package Day7;

import java.util.Scanner;

public class Add_ArrayTarget {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the target int:");
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==t){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}

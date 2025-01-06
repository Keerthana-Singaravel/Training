package Day8;
import java.util.Scanner;
public class TargetSum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the target number:");
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

package Day8;
import java.util.Scanner;
public class Sum {
    public static void amin(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0],sum=a[0];
        for(int i=0;i<a.length;i++){
            sum=Math.max(a[i],sum+a[i]);
            max=Math.max(max,sum);
        }
        System.out.println("Largest Sum = "+max);
    }
}


import java.util.Scanner;
public class SumOfArrElements {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("Sum Of Array elements = "+sum);
    }
}

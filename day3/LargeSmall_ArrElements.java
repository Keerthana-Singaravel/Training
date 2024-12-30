import java.util.Scanner;
public class LargeSmall_ArrElements {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0,min=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Max element = "+max);
        System.out.println("Min element = "+min);
    }
}

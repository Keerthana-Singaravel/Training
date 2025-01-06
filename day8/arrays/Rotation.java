package Day8;
import java.util.Scanner;
public class Rotation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the no.of rotations:");
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            int t=a[n-1];
            for(int j=n-1;j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=t;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

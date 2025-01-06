package Day8;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int z=a[0];
        for(int i=0;i<n;i++){
            if(a[i]==z){
                z++;
            }
            else{
                System.out.println(z);
            }
        }

    }
}

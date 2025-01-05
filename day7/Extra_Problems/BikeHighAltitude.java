package Day7;

import java.util.Scanner;

public class BikeHighAltitude {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the gain altitudes:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int high=a[0],sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
            if(sum>high){
                high=sum;
            }
        }
        System.out.println("highest altitude ="+high);
    }
}

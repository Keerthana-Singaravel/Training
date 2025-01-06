package Day8;

import java.util.Scanner;

public class Greatest_Num {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    b[i]=a[j];
                    break;
                }
            }
            if(b[i]==0){
                b[i]=-1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}

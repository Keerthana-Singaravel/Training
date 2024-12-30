import java.util.Scanner;
public class Add_2DMat {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array row and size :");
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        System.out.println("enter the array elements of 1st array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the array elements of 1st array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int res[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of 2 2d arrays : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

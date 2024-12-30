import java.util.Scanner;
public class Transpose_Array {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array row and size :");
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][]=new int[r][c];
//        int b[][]=new int[r][c];
        System.out.println("enter the array elements of 1st array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array Before transpose:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array after transpose:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

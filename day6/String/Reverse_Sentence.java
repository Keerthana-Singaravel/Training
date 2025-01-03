package Day6;

import java.util.Scanner;

public class Reverse_Sentence {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),res="";
        int j=0;
        String a[]=str.split(" ");
        String b[]=new String[a.length];
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
        }
        for(int i=0;i<j;i++){
//            System.out.print(b[i]+" ");
            res+=b[i]+" ";
        }
        System.out.println(res);

    }
}

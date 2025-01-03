package Day6;

import java.util.Scanner;

public class Replace_VowelChar {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),res="";
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'){
                a[i]='*';
            }
        }
        for(int i=0;i<a.length;i++){
            res+=a[i];
        }
        System.out.println(res);
    }
}

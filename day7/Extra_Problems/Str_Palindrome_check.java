package Day7;

import java.util.Scanner;

public class Str_Palindrome_check {
    public static boolean isPalindrome(String str){
        char a[]=str.toCharArray();
        String s="";
        boolean b=false;
        for(int i=a.length-1;i>=0;i--){
            s+=a[i];
        }
        if(str.equals(s)){
            b=true;
        }
        return b;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        int f=0;
        if(isPalindrome(str)){
            System.out.println("Palindrome");
            f=1;
        }
        else{
            char c[]=str.toCharArray();
            int j=c.length-1;String s="";
            for(int i=0;i<c.length;i++){
                if(i!=j) {
                    s=s+c[i];
                }
            }
            j--;
            while(isPalindrome(s)){
                System.out.println("palindrome");
                f=1;
                break;
            }
            s="";

        }
        if(f!=1){
            System.out.println("Not a palindrome");
        }

    }
}

package Day11.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailAddressValidation {

    public static void Check(String a[]){
        String str="[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9.-]+\\.(com|org|net)";
        Pattern p=Pattern.compile(str);
        for(int i=0;i<a.length;i++){
            if(p.matcher(a[i]).matches()){
                System.out.println(a[i]+" : valid");
            }
            else{
                System.out.println(a[i]+" : invalid");
            }
        }
    }

    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the array size:");
       int n=sc.nextInt();
       String a[]=new String[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextLine();
       }
       Check(a);
    }
}

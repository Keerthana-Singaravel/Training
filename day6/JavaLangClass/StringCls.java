package Day6;
import java.util.Scanner;
public class StringCls {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int length=str.length();
        System.out.println("Length of "+str+" = "+length);
        String res=str.toUpperCase();
        System.out.println("UpperCase of "+str+" = "+res);
        String SubStr=str.substring(4);
        System.out.println("Substring of "+str+" = "+SubStr);
    }
}

package Day6;
import java.util.Scanner;
public class StringMethods {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next(),res="";
        int z=a.compareTo(b);
        if(z==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        res=a.concat(b);
        System.out.println("Concatenation = "+res);
    }
}

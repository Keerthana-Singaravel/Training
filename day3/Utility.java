import java.util.Scanner;
public class Utility {
    public static String s;
    public Utility(String s){
        this.s=s;
    }
    public static String ConvertToUpper(){
        String res=s.toUpperCase();
        return res;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String to Change to Uppercase:");
        String str=sc.next();
        Utility u=new Utility(str);
        System.out.println("UpperCase of the word is : "+u.ConvertToUpper());
    }
}

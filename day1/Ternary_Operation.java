import java.util.Scanner;
public class Ternary_Operation {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num1=sc.nextInt();
        String res=(num1%2==0)?"Even":"odd";
        System.out.println(num1+" is an "+res+" number");
    }
}

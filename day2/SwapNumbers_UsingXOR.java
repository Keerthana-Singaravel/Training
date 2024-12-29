import java.util.Scanner;
public class SwapNumbers_UsingXOR {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int num1=sc.nextInt(),num2=sc.nextInt();
        System.out.println("num1="+num1+" num2="+num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("num1="+num1+" num2="+num2);;
    }
}

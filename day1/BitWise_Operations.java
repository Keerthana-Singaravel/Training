import java.util.Scanner;
public class BitWise_Operations {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int leftshift1=num1<<2;
        int leftshift2=num2<<2;
        int rightshift1=num1>>2;
        int rightshift2=num2>>2;
        int xor=num1^num2;
        System.out.println("Left Shifts :"+leftshift1+" "+leftshift2);
        System.out.println("Right Shifts :"+rightshift1+" "+rightshift2);
        System.out.println("XOR operation ="+xor);
    }
}

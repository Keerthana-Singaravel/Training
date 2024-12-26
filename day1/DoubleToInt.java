import java.util.Scanner;
public class DoubleToInt {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        double dd=9.99;
        double d=sc.nextDouble();
        int intnum1,intnum2;
        intnum1=(int)dd;
        intnum2=(int)d;
        System.out.println("Integer = "+intnum1+" , "+intnum2);;
    }
}

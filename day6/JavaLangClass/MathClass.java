package Day6;

import java.util.Scanner;

public class MathClass {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int square=(int)Math.sqrt(a);
        System.out.println("SquareRoot of "+a+" = "+square);
        int power=(int)Math.pow(a,b);
        System.out.println("Power of "+a+" & "+b+" = "+power);
        int max=Math.max(a,b);
        System.out.println("Maximum of "+a+" & "+b+" = "+max);
    }
}

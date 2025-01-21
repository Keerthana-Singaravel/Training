package Day16.BiConsumer;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class SumOfNums {
    public static void Calculate(int a, int b, BiConsumer<Integer,Integer> d){
        d.accept(a,b);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int x=sc.nextInt(),y=sc.nextInt();
        BiConsumer<Integer,Integer> sum=(m,n) -> System.out.println(m+" + "+n+" = "+(m+n));
        Calculate(x,y,sum);
    }
}

package Day17;

import java.util.function.BinaryOperator;

public class MaximunTwoNumbers {
    public static void main(String [] args){
        int a=10,b=15;
        BinaryOperator<Integer> bin=(x,y) -> {
            if(x>y){
                x=x;
            }else{
                x=y;
            }
            return x;
        };
        Integer res=bin.apply(a,b);
        System.out.println(res);
    }
}

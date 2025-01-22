package Day17;

import java.util.function.UnaryOperator;

public class StringUpperCaseConvert {
    public static void main(String [] args){
        String s="hello";
        UnaryOperator<String> u=String::toUpperCase;
        String res=u.apply(s);
        System.out.println("Changed str : "+res);

    }
}

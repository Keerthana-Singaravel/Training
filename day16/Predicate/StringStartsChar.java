package Day16.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringStartsChar {
    public static void Print(List<String> s, Predicate<String> p){
        for(String x:s) {
            if (p.test(x)) {
                System.out.println(x);
            }
        }
    }
    public static void main(String [] args){
        List<String> s=new ArrayList<String>();
        s.add("Apple");
        s.add("Banana");
        s.add("Avacado");
        s.add("Cherry");

        Predicate<String> str=k -> k.startsWith("A");
        Print(s,str);
    }
}

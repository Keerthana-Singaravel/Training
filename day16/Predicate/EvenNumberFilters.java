package Day16.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenNumberFilters {

    public static void Print(List<Integer> l, Predicate<Integer> p){
        for(Integer i:l){
            if(p.test(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String [] args){
        List<Integer> l=new ArrayList<>();
        l.add(43);
        l.add(57);
        l.add(92);
        l.add(12);
        l.add(46);

        Predicate<Integer> even=k -> k%2==0;
        Print(l,even);
    }
}

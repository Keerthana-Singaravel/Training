package Day5;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_integers {
    public static void main(String [] args){
        List<Integer> l=new ArrayList<Integer>();
        l.add(23);
        l.add(44);
        l.add(55);
        l.add(17);
        int sum=0;
        System.out.println("Numbers list :"+l);
        for(Integer n:l){
            sum+=n;
        }
        System.out.println("Sum of elements: "+sum);
    }
}

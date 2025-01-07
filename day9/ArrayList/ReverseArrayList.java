package Day9;

import Day5.ArrayList_integers;

import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String [] args){
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println("Before reverse : "+a);
        ArrayList<Integer> r=new ArrayList<Integer>();
        for(int i=a.size()-1;i>=0;i--){
            r.add(a.get(i));
        }
        System.out.println("Reversed list :"+r);
    }
}

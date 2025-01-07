package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(15);
        a.add(22);
        a.add(8);
        a.add(42);
        a.add(17);
        System.out.println("Element : "+a);
        int max=0;
        for(int i:a){
            if(max<i){
                max=i;
            }
        }
        System.out.println("Maximun element: "+max);
    }
}

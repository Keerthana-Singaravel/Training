package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<String>();
        a.add("Milk");
        a.add("Eggs");
        a.add("Bread");
        a.add("Butter");

        System.out.println("List : "+a);

        System.out.println("enter the item to remove:");
        String s=sc.nextLine();
        if(a.contains(s)){
            a.remove(s);
        }

        System.out.println("List : "+a);

    }
}

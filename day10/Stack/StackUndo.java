package Day10.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackUndo {
    private static void Perform(Stack<String> s,StringBuilder t,String str) {
        if(str.startsWith("Type ")) {
            String z = str.substring(5);
            s.push(z);
            t.append(z).append(" ");
            System.out.println(str);
        }
    }
    public static void Undo(Stack<String> s,StringBuilder t) {
        String l=s.pop();
        int i=t.lastIndexOf(l+" ");
        if(i!=-1) {
            t.delete(i, i + l.length() + 1);
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<String>();
        StringBuilder text = new StringBuilder();
        Perform(s,text,"Type Hello");
        Perform(s,text,"Type World");
        Undo(s,text);
        Perform(s,text,"Type Java");

        System.out.println("Current text :"+text.toString());
    }
}

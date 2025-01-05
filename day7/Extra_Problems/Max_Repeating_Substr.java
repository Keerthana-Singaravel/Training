package Day7;

import java.util.Scanner;
public class Max_Repeating_Substr {
    public static void MaximumRepeat(String seq, String word){
        int max = 0;
        String temp = word;
        while (seq.contains(word)) {
            max++;
            temp=temp+ word;
        }
        System.out.println(max);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sequence and word:");
        String seq=sc.nextLine();
        String word=sc.nextLine();
        MaximumRepeat(seq,word);
    }
}

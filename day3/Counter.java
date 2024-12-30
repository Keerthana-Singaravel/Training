import java.util.Scanner;
public class Counter {
    static int count=0;
    public Counter(){
        count++;
    }
    public static int GetCount(){
        return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Counter a=new Counter();
        Counter b=new Counter();
        Counter c=new Counter();
        System.out.println("No.of objects created: "+a.GetCount());
    }
}

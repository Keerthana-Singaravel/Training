import java.util.Scanner;
public class BinaryOfNum_1sCount {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt(),c=0;
        while(num>0){
            num=num^(num-1);
            c++;
        }
        System.out.println(c);;
    }
}

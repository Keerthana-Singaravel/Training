import java.util.Scanner;
public class ReverseNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(),res=0;
        while(num!=0){
            int d=num%10;
            res=res*10+d;
            num/=10;
        }
        System.out.println(res);;
    }
}

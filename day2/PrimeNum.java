import java.util.Scanner;
public class PrimeNum {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int f=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                f=1;
                i=num;
            }
        }
        if(f==0){
            System.out.println(num+" is a prime number");;
        }
    }
}

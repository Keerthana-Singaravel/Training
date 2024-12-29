import java.util.Scanner;
public class LargestOfThreeNum_TernaryOperator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),max=0;
        max=(a>b)?(a>c?a:c):(b>c?b:c);;
        System.out.println("Largest of Three Number is: "+max);
    }
}

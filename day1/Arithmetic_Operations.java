import java.util.Scanner;
public class Arithmetic_Operations {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 integers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int add=x+y,sub=x-y,mul=x*y,mod=x%y,div;
        if(x>y){
            div=x/y;
        }
        else{
            div=y/x;
        }
        System.out.println("Add ="+add);
        System.out.println("Sub ="+sub);
        System.out.println("Multiple ="+mul);
        System.out.println("Divide ="+div);
        System.out.println("Modulo ="+mod);
    }
}

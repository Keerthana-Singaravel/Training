package Day7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt(),b=sc.nextInt();
            int div=a/b;
            System.out.println("Result : "+div);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed....");
        }catch(InputMismatchException e){
            System.out.println("Invalid input entered...please enter an integer value...");
        }catch(Exception e){
            System.out.println("An error is occured...");
        }finally{
            System.out.println("Program executed ...");
        }
    }
}

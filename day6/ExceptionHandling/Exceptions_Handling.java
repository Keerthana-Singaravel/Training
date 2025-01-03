package Day6;

import java.util.Scanner;

public class Exceptions_Handling {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        try{
            int res=a/b;
            System.out.println("Result = "+res);
        } catch(ArithmeticException e){
            System.out.println("Error!!...Division by zero is not allowed...");
        } catch(NumberFormatException e){
            System.out.println("Error!!!...please enter valid integer ...");
        } catch(Exception e){
            System.out.println("An unexpected error....");
        }finally{
            System.out.println("Executed...");
        }
    }
}

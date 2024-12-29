import java.util.Scanner;
public class IfZeroEnter_ExitLoop {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num;
        while(true){
            System.out.println("enter the number");
            num=sc.nextInt();
            if(num==0){
                System.out.println("you entered 0 and exits the loop");
                break;
            }
            System.out.println("You entered:"+num);;
        }
    }
}

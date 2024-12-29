import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1=sc.nextInt(),n2=sc.nextInt(),res;
        System.out.println("Enter any one operator: +,-,*,/");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                res=n1+n2;
                System.out.println(n1+" + "+n2+" = "+res);
                break;
            case '-':
                res=n1-n2;
                System.out.println(n1+" - "+n2+" = "+res);
                break;
            case '*':
                res=n1*n2;
                System.out.println(n1+" * "+n2+" = "+res);
                break;
            case '/':
                res=n1/n2;
                System.out.println(n1+" / "+n2+" = "+res);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}

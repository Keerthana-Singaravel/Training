import java.util.Scanner;
public class Account {
    public String accountNo;
    public int balance;

    public Account(){
        this.accountNo="0";
        this.balance=0;
    }

    public Account(String accountNo){
        this.accountNo=accountNo;
    }

    public Account(String accountNo,int balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    public void Display(){
        System.out.println("Account number : "+accountNo);
        System.out.println("Account balance : "+balance);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Account da=new Account();
        Account num=new Account("123456789");
        Account details=new Account("123456",4000);

        System.out.println("default constructor:");
        da.Display();
        System.out.println("constructor with acc_No:");
        num.Display();
        System.out.println("constructor with balance and account_number:");
        details.Display();

    }
}

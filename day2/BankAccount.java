import java.util.Scanner;
public class BankAccount {
      private String acc_num;
      private int balance;

      public BankAccount(String a,int b){
          this.acc_num=a;
          this.balance=b;
      }

    public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else{
            System.out.println("Insufficient balance.");
        }
    }
    public void getbalance(){
          System.out.println("balance = "+balance);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the accountnumber and balance:");
        String acc_num=sc.next();
        int balance=sc.nextInt();
        BankAccount b=new BankAccount(acc_num,balance);
        System.out.println("enter the amount to deposit:");
        int d=sc.nextInt();
        b.deposit(d);
        System.out.println("enter the amount to withdraw:");
        int w=sc.nextInt();
        b.withdraw(w);
        b.getbalance();
    }
}

import java.util.Scanner;
public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public double add(double num1,double num2){
        return num1+num2;
    }
    public int add(int z[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=z[i];
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Calculator ca=new Calculator();
        System.out.println("enter the integers:");
        int a=sc.nextInt(),b=sc.nextInt();
        int res1=ca.add(a,b);
        System.out.println("Integer sum="+res1);

        System.out.println("enter the double:");
        double c=sc.nextDouble(),d=sc.nextDouble();
        double res2=ca.add(c,d);
        System.out.println("Double sum="+res2);

        System.out.println("enter the array size:");
        int n=sc.nextInt();
        int z[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++){
            z[i]=sc.nextInt();
        }
        int res3=ca.add(z,n);
        System.out.println("Array sum="+res3);
    }
}

import java.util.Scanner;
public class Employee {
    public int id;
    public String name;
    public int salary;
    Employee(int i,String n,int s){
        this.id=i;
        this.name=n;
        this.salary=s;
        System.out.println("Employee Id = "+i);
        System.out.println("Employee Name = "+n);
        System.out.println("Employee Salary = "+s);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id,name and salary of an employee :");
        int id=sc.nextInt();
        String name=sc.next();
        int salary=sc.nextInt();
        Employee em=new Employee(id,name,salary);
    }
}

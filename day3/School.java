import java.util.Scanner;
class Person{
    public String n;
    public int a;

    public Person(String name,int age){
        this.n=name;
        this.a=age;
    }
    public void PersonDisplay(){
        System.out.println("Person_Name : "+n);
        System.out.println("Person_Age : "+a);
    }
}
class Students extends Person{
    public int roll,mark;

    public Students(String name,int age,int roll,int mark){
        super(name,age);
        this.roll=roll;
        this.mark=mark;
    }
    public void StudentDisplay(){
        PersonDisplay();
        System.out.println("Student roll.no: "+roll);
        System.out.println("Student mark : "+mark);
    }
}
public class School {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name and age of the person : ");
        String name=sc.next();
        int age=sc.nextInt();
        System.out.println("enter the rollno and marks of the Student : ");
        int roll=sc.nextInt();
        int marks=sc.nextInt();
        Students s=new Students(name,age,roll,marks);
        s.StudentDisplay();
    }
}

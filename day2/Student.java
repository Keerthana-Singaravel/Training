import java.util.Scanner;
public class Student {
    public String name;
    public int age;
    Student(String n,int a){
        this.name=n;
        this.age=a;
    }
    public void Display(){
        System.out.println("Student name : "+name);
        System.out.println("Student age : "+age);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name and age of a Student:");
        String name=sc.next();
        int age=sc.nextInt();
        Student s=new Student(name,age);
        s.Display();
    }

}

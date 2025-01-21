package Day16.Consumer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Student{
    public String name;
    public int grade;

    public Student(String name,int grade){
        this.name=name;
        this.grade=grade;
    }
    public String toString(){
        return name+" , "+grade;
    }
}
public class StudentGradeModify {
    public static void Print(List<Student> t,Consumer<Student> con){
        for(Student z:t){
            con.accept(z);
        }
    }
    public static void main(String [] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("John",70));
        s.add(new Student("Alice",60));
        s.add(new Student("Mark",50));

        Consumer<Student> inc=z -> z.grade+=10;
        Print(s,inc);
        for(Student x:s){
            System.out.println(x);
        }
    }
}

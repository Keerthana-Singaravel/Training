package Day16.Predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
public class StudentGrade {
    public static void Print(List<Student> s, Predicate<Student> p){
        for(Student x:s){
            if (p.test(x)) {
                System.out.println(x);
            }
        }
    }
    public static void main(String [] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("John",75));
        s.add(new Student("Alice",55));
        s.add(new Student("Mark",88));

        Predicate<Student> l=r ->r.grade>60;
        Print(s,l);
    }
}

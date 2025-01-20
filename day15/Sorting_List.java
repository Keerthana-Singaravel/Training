package Day15;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface SortStudent{
    public void sort(List<Student> s);
}
class Student{
    public String name;
    public double gpa;

    public Student(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public double getgpa(){
        return gpa;
    }
    public String toString(){
        return "Student{name = "+name+" , gpa= "+gpa+ "}";
    }
}
public class Sorting_List {
    public static void main(String [] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("Keerthu",8.43));
        s.add(new Student("Bharath",8.21));
        s.add(new Student("jayashree",7.96));
        s.add(new Student("Bharathi",7.65));
        s.add(new Student("Gowtham",8.89));

        SortStudent sortGpa = (sList) -> sList.sort((s1,s2) -> Double.compare(s2.getgpa(),s1.getgpa()));

        sortGpa.sort(s);
        System.out.println(s);
    }
}

package Day17;

class Student{
    public String name;
    public int marks;
    public Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public int getMark(){
        return marks;
    }
    public String toString(){
        return "name = "+name+" , mark = "+marks+" ";
    }
}
interface StudentDetails{
    Student create(String name,int marks);
}
public class ConstructorMethodReference {
    public static void main(String [] args){
        StudentDetails d=Student::new;
        Student s1=d.create("Keerthu",98);
        Student s2=d.create("bharath",82);
        System.out.println(s1);
        System.out.println(s2);
    }
}

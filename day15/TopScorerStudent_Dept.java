package Day15;

import java.util.*;
import java.util.stream.Collectors;

class Students{
     public String name;
     public String dept;
     public double gpa;

     public Students(String name,String dept,double gpa){
         this.name=name;
         this.dept=dept;
         this.gpa=gpa;
     }
     public String getname(){
         return name;
     }
    public String getdept(){
        return dept;
    }
    public double getgpa(){
        return gpa;
    }
    public String toString(){
         return "{Name : "+name+" , department : "+dept+" , GPA : "+gpa+" }";
    }
 }
public class TopScorerStudent_Dept {
    public static void main(String [] args){
        List<Students> s=new ArrayList<>();
        s.add(new Students("keerthu","CSE",8.45));
        s.add(new Students("Bharath","EEE",8.22));
        s.add(new Students("Jayashree","CSE",7.98));
        s.add(new Students("Bharathi","ECE",7.45));
        s.add(new Students("Gowtham","Mech",9.67));
        s.add(new Students("Gopika","Mech",9.85));

        Map<String, Optional<Students>> top=s.stream().collect(Collectors.groupingBy(Students::getdept,Collectors.maxBy(Comparator.comparingDouble(Students::getgpa))));
        top.forEach((department, st) -> {
            System.out.println("Department: " + department);
            st.ifPresent(System.out::println);
        });
    }
}

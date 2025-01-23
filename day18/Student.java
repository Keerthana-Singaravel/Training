package Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks;
    private double avg;
    private String grade;
    private String department;

    public Student(String name,List<Integer> m,String dept){
        this.name=name;
        this.marks=m;
        this.department=dept;
        this.avg=CalAvgMark();
        this.grade=calculateGrade();
    }
    public String getName(){
        return name;
    }
    public List<Integer> getMarks(){
        return marks;
    }
    public String getDepartment(){
        return department;
    }
    public double getAvg(){
        return avg;
    }
    public String getGrade(){
        return grade;
    }
    public double CalAvgMark() {
        return marks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
    public String calculateGrade(){
        if(avg>=90) return("A");
        else if(avg>=70) return("B");
        else if(avg>=65) return("C");
        else return("D");
    }

    public String toString() {
        return "Name: " + name + ", Department: " + department +
                ", Average: " + avg + ", Grade: " + grade;
    }
}

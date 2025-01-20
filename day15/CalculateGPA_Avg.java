package Day15;

import java.util.ArrayList;
import java.util.List;

class Details{
    public String name;
    public double gpa;

    public Details(String name,double gpa){
        this.name=name;
        this.gpa=gpa;
    }
    public double getgpa(){
        return gpa;
    }
}
public class CalculateGPA_Avg {
    public static void main(String [] args){
      List<Details> s=new ArrayList<>();
        s.add(new Details("Keerthu",8.45));
        s.add(new Details("Bharath",8.22));
        s.add(new Details("Jayashree",7.88));
        s.add(new Details("Bharathi",7.98));

        double avg=calculate(s);
        System.out.println("Average : "+avg);
    }
    public static double calculate(List<Details> d){
        return d.stream().mapToDouble(Details::getgpa).average().orElse(0.0);
    }
}

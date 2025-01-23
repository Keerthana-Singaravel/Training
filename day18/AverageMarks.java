package Day18;

import java.util.*;
import java.util.stream.Collectors;

public class AverageMarks {
    public static void main(String [] args){
        List<Student> s=new ArrayList<>();
        s.add(new Student("keerthu", Arrays.asList(84,83,72,95,89),"CSE"));
        s.add(new Student("Bharath", Arrays.asList(67,87,93,86,71),"CSE"));
        s.add(new Student("Jayashree", Arrays.asList(84,73,52,65,89),"EEE"));
        s.add(new Student("Bharathi", Arrays.asList(64,73,79,75,89),"ECE"));
        s.add(new Student("Gopika", Arrays.asList(77,82,72,95,89),"EEE"));
        s.add(new Student("Gowtham", Arrays.asList(64,41,32,35,49),"CSE"));


        List<Student> top=s.stream()
                .sorted((x,y) -> Double.compare(y.getAvg(),x.getAvg()))
                .limit(3)
                .toList();
        System.out.println("Top 3 Students: ");
        top.forEach(System.out::println);

        Map<String,Double> dep=s.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student::getAvg)));
        System.out.println("Average marks: ");
        dep.forEach((Dep,avg)-> System.out.println((Dep+"="+avg)));

        Map<String, Optional<Student>> std = s.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, // Group by department
                        Collectors.maxBy(Comparator.comparingDouble(Student::getAvg))
                ));
        System.out.println("Top students in departments: ");
        std.forEach((dept,st) ->System.out.println((dept+" = "+(st.isPresent()?st.get():"no student"))));

        Map<String,Long> fail=s.stream()
                .filter(sd -> sd.getAvg()<50)
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));

        System.out.println("No.of Failed students failed : ");
        fail.forEach((d,c)->System.out.println(d+" = "+c));
    }
}

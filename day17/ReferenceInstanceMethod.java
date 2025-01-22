package Day17;

import java.util.ArrayList;
import java.util.List;


class Students {
    private String name;
    private int marks;

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public void Print() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
public class ReferenceInstanceMethod {
    public static void main(String [] args){
        List<Students> s = new ArrayList<>();
        s.add(new Students("Alice", 90));
        s.add(new Students("Bob", 85));
        s.add(new Students("Charlie", 88));
        s.forEach(Students::Print);
    }
}

package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TransformName {
    public static List<String> transform(List<String> n){
        return n.stream().map(name -> "Student : "+name.toUpperCase()).collect(Collectors.toList());
    }
    public static void main(String [] args){
        List<String> s=new ArrayList<String>();
        s.add("keerthu");
        s.add("bharath");
        s.add("jayashree");
        s.add("bharathi");
        s.add("gowtham");
        List<String> t=transform(s);
        System.out.println(t);

    }
}

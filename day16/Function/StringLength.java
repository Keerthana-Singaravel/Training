package Day16.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLength {
    public static List<Integer> Print(List<String> s, Function<String,Integer> f){
        return s.stream().map(f).collect(Collectors.toList());
    }

    public static void main(String [] args){
        List<String> s = new ArrayList<>();
        s.add("Hello");
        s.add("World");
        s.add("Java");
        Function<String,Integer> str=String::length;
        List<Integer> len=Print(s,str);
        System.out.println(len);
    }
}

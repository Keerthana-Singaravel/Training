package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Lists{
    public String name;
    public int age;

    public Lists(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getname(){
        return name;
    }
    public String toString(){
        return "{name = "+name+" , age = "+age+" } ";
    }
}
public class FindNames {
    public static void main(String [] args){
        List<Lists> l=new ArrayList<>();
        l.add(new Lists("Keerthu",21));
        l.add(new Lists("Bharath",22));
        l.add(new Lists("Bharathi",23));
        l.add(new Lists("Bala",21));
        l.add(new Lists("Gowtham",25));

        List<Lists> f= Find(l,'B');
        System.out.println(f);

    }
    public static List<Lists> Find(List<Lists> l,char s){
        return l.stream().filter(ls -> ls.getname().startsWith(String.valueOf(s))).collect(Collectors.toList());
    }
}

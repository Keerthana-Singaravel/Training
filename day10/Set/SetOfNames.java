package Day10.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOfNames {
    public static void main(String [] args){
        Set<String> s=new HashSet<String>();
        s.add("Alice");
        s.add("Bob");
        s.add("Alice");
        s.add("Eve");
        s.add("Charlie");

        System.out.println("Unique Names:"+s);

    }
}

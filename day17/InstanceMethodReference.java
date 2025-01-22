package Day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

class Values{
    public String value;
    public Values(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
public class InstanceMethodReference {
    public static void main(String [] args){
        List<Values> l=new ArrayList<>();
        l.add(new Values("Apple"));
        l.add(new Values("Banana"));
        l.add(new Values("Cricket"));
        l.add(new Values("Lotus"));
        l.add(new Values("Script"));
        l.add(new Values("Zebra"));

        Collections.sort(l,comparing(Values::getValue));
        System.out.println(l);
    }
}

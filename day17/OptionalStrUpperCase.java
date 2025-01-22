package Day17;

import java.util.Optional;
class Value{
    public String name;
    public Value(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class OptionalStrUpperCase {
    public static void main(String [] args){
        Value v=new Value("keerthu");
        Optional<String> op= Optional.ofNullable(v.getName());
        if(op.isPresent()){
            System.out.println(v.getName().toUpperCase());
        }else{
            System.out.println("Empty input");
        }
    }
}

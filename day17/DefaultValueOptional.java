package Day17;

import java.util.Optional;

public class DefaultValueOptional {
    public static void main(String [] args){
        Value v=new Value(null);
        Optional<String> op= Optional.ofNullable(v.getName());
        if(op.isPresent()){
            System.out.println(v.getName().toUpperCase());
        }else{
            System.out.println("Guest");
        }
    }
}

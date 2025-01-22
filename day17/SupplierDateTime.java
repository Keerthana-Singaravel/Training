package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDateTime {
    public static void main(String [] args){
        Supplier<LocalDateTime> s= LocalDateTime::now;
        LocalDateTime res=s.get();
        System.out.println("Current date and time :"+res);
    }
}

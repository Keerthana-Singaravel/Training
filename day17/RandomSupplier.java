package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String [] args){
        Supplier<Integer> sup=() -> new Random().nextInt(100);
        System.out.println("Random num:");
        for(int i=0;i<5;i++){
            System.out.println(sup.get());
        }
    }
}

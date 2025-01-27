package Day19.CallableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Fact implements Callable<Long>{
    private final int num;
    public Fact(int num){
        this.num=num;
    }
    public Long call()throws Exception{
        return calculate(num);
    }

    private Long calculate(int num) {
        long res=1;
         for(int i=1;i<=num;i++){
             res=res*i;
         }
         return res;
    }

}
public class Factorial {
    public static void main(String [] args){
        int n=13;
        ExecutorService ex= Executors.newSingleThreadExecutor();
        Fact t=new Fact(n);
        Future<Long> f=ex.submit(t);
        try{
            Long res=f.get();
            System.out.println("Factorial : "+res);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            ex.shutdown();
        }
    }
}

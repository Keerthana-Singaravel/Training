package Day11.Concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OnlineVotes {
    public static void main(String [] args){
        ConcurrentMap<String,Integer> n=new ConcurrentHashMap<>();
        ExecutorService e= Executors.newFixedThreadPool(4);
        e.execute(()->{
            n.merge("Alice",1,Integer::sum);
        });
        e.execute(()->{
            n.merge("Bob",1,Integer::sum);
        });
        e.execute(()->{
            n.merge("Alice",1,Integer::sum);
        });
        e.execute(()->{
            n.merge("Charlie",1,Integer::sum);
        });
        e.shutdown();//shut down after all tasks completes
        while(!e.isTerminated()){//wait for all thread to complete

        }
        System.out.println("Final Votes are:");
        n.forEach((c,count) -> {
            System.out.println(c+" : "+count);
        });
    }
}

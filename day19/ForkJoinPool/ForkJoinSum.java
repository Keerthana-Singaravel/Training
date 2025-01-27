package Day19.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Long>{
    private static final int threshold=10000;
    private final long s;
    private final long e;
    public Sum(long s,long e){
        this.s=s;
        this.e=e;
    }
    public Long compute(){
        if(e-s<=threshold){
            long sum=0;
            for(long i=s;i<=e;i++){
                sum=sum+i;
            }
            return sum;
        }
        else{
            long m=(s+e)/2;
            Sum l=new Sum(s,m);
            Sum r=new Sum(m+1,e);
            l.fork();
            r.fork();
            return l.join()+r.join();
        }
    }
}
public class ForkJoinSum {
    public static void main(String [] args){
        long s=1;
        long e=100000;
        ForkJoinPool p=new ForkJoinPool();
        Sum t=new Sum(s,e);
        long sum=p.invoke(t);
        System.out.println("total sum : "+sum);
    }
}

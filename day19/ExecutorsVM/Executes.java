package Day19.ExecutorsVM;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Print implements Runnable{
    public final int task;
    public Print(int task){
        this.task=task;
    }
    public void run(){
        System.out.println("Task = "+task+" , Thread ="+Thread.currentThread().getName());
        try{
            Thread.sleep(100);
        }catch(InterruptedException e){
            System.out.println(task+" was Interrupts");
        }
    }
}
public class Executes {
    public static void main(String [] args){
        ExecutorService exe= Executors.newFixedThreadPool(6);
        System.out.println("tasks submitted to executor...");
        for(int i=1;i<=11;i++){
            exe.submit(new Print(i));
        }
        exe.shutdown();

    }
}

package Day19.CompletableFuture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintTask implements Runnable {
    private final int taskId;
    public PrintTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskId + " is executed by thread " + Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Task " + taskId + " was interrupted.");
        }
    }
}

public class ExecutorsExample {
    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(5);
        System.out.println("Tasks submitted...");
        for (int i = 1; i <= 10; i++) {
            e.submit(new PrintTask(i));
        }
        e.shutdown();
        System.out.println("All tasks completed");
    }
}

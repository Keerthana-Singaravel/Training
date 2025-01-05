package Day7;

public class Threads {
    public static void main(String [] args){
        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    System.out.println("Thread 1: "+i);
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException e){
                        System.out.println("Something went wrong..");
                    }
                }
            }
        });
        Thread th2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++){
                    System.out.println("Thread 2 : "+(i*i));
                    try{
                        Thread.sleep(700);
                    }catch(InterruptedException e){
                        System.out.println("error occured...");
                    }
                }
            }
        });
        th1.start();
        th2.start();
    }
}

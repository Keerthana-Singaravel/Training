package Day7;
class SharedPrinter {
    public synchronized void printString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(Thread.currentThread().getName() + " - Printing: " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void printCountdown(int start) {
        for (int i = start; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName() + " - Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void printStringStatic(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(Thread.currentThread().getName() + " - Static Printing: " + str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void printCountdownStatic(int start) {
        for (int i = start; i >= 0; i--) {
            System.out.println(Thread.currentThread().getName() + " - Static Countdown: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Locking {
    public static void main(String[] args){
        SharedPrinter sharedPrinter = new SharedPrinter();

        Thread thread1 = new Thread(() -> sharedPrinter.printString("Hello", 5), "Thread-1");
        Thread thread2 = new Thread(() -> sharedPrinter.printCountdown(5), "Thread-2");

        System.out.println("Starting Object-Level Locking Demo:");
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread3 = new Thread(() -> SharedPrinter.printStringStatic("Static Hello", 5), "Thread-3");
        Thread thread4 = new Thread(() -> SharedPrinter.printCountdownStatic(5), "Thread-4");

        System.out.println("\nStarting Class-Level Locking Demo:");
        thread3.start();
        thread4.start();

        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package practice;

public class MultiThreading {
    public static Object monitor = new Object();
    public static Runnable printhelloWorld = new Runnable() {
        public void run() {
            System.out.println("Hello World! from " + Thread.currentThread().toString());
        }
    };

    public static Runnable sleepingRunnable = new Runnable() {
        public void run() {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted and is now in state " + Thread.currentThread().getState());
                }
            }
        }
    };

    public static Runnable runningRunnable = new Runnable() {
        public void run() {
            while (true) {
            }
        }
    };

    public static Runnable synchronisedRunnable = new Runnable() {
        public void run() {
            System.out.println(Thread.currentThread().toString() + " Entered Runnable Method");
            synchronized (monitor) {
                try {
                    System.out.println(Thread.currentThread().toString() + " Entered Synchronized Block");
                    monitor.wait();
                    System.out.println("Running Now!!");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().toString() + " Interrputed");
                }
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        // for (int i = 0; i < 5; i++) {
        // new Thread(printhelloWorld).start();
        // }
        // new HelloWorldPrinter().start();
        // Thread sleepingThread = new Thread(sleepingRunnable);
        // System.out.println(sleepingThread.getState());
        // sleepingThread.start();
        // Thread.sleep(3000);
        // System.out.println(sleepingThread.getState());
        // sleepingThread.interrupt();

        // Thread runningThread = new Thread(runningRunnable);
        // runningThread.start();
        // System.out.println(runningThread.getState());
        // System.out.println(runningThread.isInterrupted());
        // runningThread.interrupt();
        // System.out.println(runningThread.getState());
        // System.out.println(runningThread.isInterrupted());

        Thread t1 = new Thread(synchronisedRunnable);
        Thread t2 = new Thread(synchronisedRunnable);
        Thread t3 = new Thread(synchronisedRunnable);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(1000);

        System.out.println();
        System.out.println(t1.toString() + t1.getState());
        System.out.println(t2.toString() + t2.getState());
        System.out.println(t3.toString() + t3.getState());
        System.out.println();
        Thread.sleep(500);

        synchronized(monitor){
            monitor.notifyAll();
        }
        
        while (true) {
            System.out.println();
            System.out.println(t1.toString() + t1.getState());
            System.out.println(t2.toString() + t2.getState());
            System.out.println(t3.toString() + t3.getState());
            System.out.println();
            Thread.sleep(500);
            if (t1.isAlive() || t2.isAlive() || t3.isAlive())
                continue;
            else
                break;
        }
    }

}

package practice;

public class MultiThreading {

    public static Runnable printhelloWorld = new Runnable() {
        public void run() {
            System.out.println("Hello World! from " + Thread.currentThread().toString());
        }
    };

    public static Runnable sleepingRunnable = new Runnable() {
        public void run() {
            while (!Thread.interrupted()) {
                try {
                    Thread.sleep(100000);
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
    }

}

package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceLearning {
    public static Runnable sleepingRunnable = () -> {
        try {
            System.out.println("A Thread Started");
            Thread.sleep(3000);
            System.out.println("A Thread Completed");
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
    };

    public static void main(String[] args) {

        try (ExecutorService es = Executors.newFixedThreadPool(3)) {
            // es.submit(sleepingRunnable);
            // es.submit(sleepingRunnable);
            // es.submit(sleepingRunnable);
            // es.submit(sleepingRunnable);
            // es.submit(sleepingRunnable);
            
            // System.out.println(es.awaitTermination(8, TimeUnit.SECONDS));
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            
        }
    }

}

package practice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceLearning {
    public static Runnable sleepingRunnable = () -> {
        try {
            System.out.println("A Thread Started");
            Thread.sleep(10000);
            // System.out.println("A Thread Completed");
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
    };

    public static void main(String[] args) {

        // try (ExecutorService es = Executors.newFixedThreadPool(5)) {
        //     // es.submit(sleepingRunnable);
        //     // es.submit(sleepingRunnable);
        //     // es.submit(sleepingRunnable);
        //     // es.submit(sleepingRunnable);
        //     // es.submit(sleepingRunnable);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // try (ExecutorService es = Executors.newWorkStealingPool(5)) {
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    
        // try (ExecutorService es = Executors.newSingleThreadExecutor()) {
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        //     es.submit(sleepingRunnable);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // try (ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor()) {
        //     // ses.schedule(sleepingRunnable, 2, TimeUnit.SECONDS);
        //     ses.scheduleAtFixedRate(sleepingRunnable, 2, 2, TimeUnit.SECONDS);
        //     Thread.sleep(10000);
        //     ses.close();
        //     Thread.sleep(10000);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
        ScheduledFuture sf = ses.scheduleAtFixedRate(sleepingRunnable, 0, 1, TimeUnit.SECONDS);
        ScheduledExecutorService es = Executors.unconfigurableScheduledExecutorService(ses);
        // try {
        //     sf.getDelay(TimeUnit.SECONDS);
        //     Thread.sleep(5000);
        //     System.out.println(sf.cancel(true));
        //     // System.out.println(sf.exceptionNow());
        //     // ses.shutdownNow();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }

}

package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

public class VirtualThreads {

    private static Logger logger = Logger.getLogger(VirtualThreads.class.getName());

    public static Runnable printHelloWorld = () -> {
        System.out.println("Hello World");
    };

    public static void main(String[] args) {
        // try (ExecutorService es = Executors.newVirtualThreadPerTaskExecutor()) {
        //     es.submit(printHelloWorld); 
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        System.out.println(Thread.ofVirtual().factory().newThread(printHelloWorld).isVirtual());

        System.out.println(Thread.ofPlatform().name("Simple Printer").daemon(true).priority(2).factory().newThread(printHelloWorld).isAlive());

        Thread.startVirtualThread(printHelloWorld);

    }
}

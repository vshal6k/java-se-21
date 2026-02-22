package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafety {

    public static Callable<Shared> getSharedObject = () -> {
        return new Shared();
    };

    public static List <String> list = new ArrayList<>();
    public static List <String> syncList = Collections.synchronizedList(list);

    public static Runnable addToList = () -> {
        synchronized(list){
            list.add(Thread.currentThread().getName());
        }
    };

    public static void main(String[] args) {
        // Shared s = new Shared();

        // Thread RunTillAChanged = new Thread(() -> {
        // while(s.a == 1){
        // System.out.println("a is " + s.a);
        // }
        // System.out.println("RunTillAChanged is exiting.");
        // });

        // Thread ChangeA = new Thread(() -> {
        // s.a = 2;
        // });

        // RunTillAChanged.start();

        // ChangeA.start();

        // System.out.println(ChangeA.isAlive());
        // System.out.println(RunTillAChanged.isAlive());

        // Shared s1 = new Shared();
        // System.out.println(s1.id);

        // Shared s2 = new Shared();
        // System.out.println(s2.id);

        for(int i = 0; i < 10; i++){
            new Thread(addToList).start();
        }

        System.out.println(list);
        
    }
}

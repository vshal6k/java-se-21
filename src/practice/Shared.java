package practice;

import java.util.concurrent.atomic.AtomicInteger;

public class Shared {
    public static int a = 0;
    public static AtomicInteger id = new AtomicInteger(0);

    public Shared(){
        id.incrementAndGet();
        a++;
    }

}

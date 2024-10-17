package src.com.dhanush.learnJava.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicBiCounter {
    /*
        Instead of int mention it as AtomicInteger which will be ThreadSafe
        by default
     */
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    public void incrementI(){
        i.incrementAndGet();
    }

    public void incrementJ(){
        j.incrementAndGet();
    }

    public int getI(){
        return i.get();
    }

    public int getJ(){
        return j.get();
    }
}

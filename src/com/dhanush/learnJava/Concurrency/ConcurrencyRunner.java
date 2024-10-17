package src.com.dhanush.learnJava.Concurrency;

public class ConcurrencyRunner {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.getI() + "\n");

        BiCounter biCounter = new BiCounter();
        biCounter.incrementI();
        biCounter.incrementI();
        biCounter.incrementJ();
        biCounter.incrementJ();
        System.out.println(biCounter.getI());
        System.out.println(biCounter.getJ() +"\n");

        BiCounterWithLock biCounterWithLock = new BiCounterWithLock();
        biCounterWithLock.incrementI();
        biCounterWithLock.incrementI();
        biCounterWithLock.incrementJ();
        biCounterWithLock.incrementJ();
        System.out.println(biCounterWithLock.getI());
        System.out.println(biCounterWithLock.getJ() + "\n");
    }
}

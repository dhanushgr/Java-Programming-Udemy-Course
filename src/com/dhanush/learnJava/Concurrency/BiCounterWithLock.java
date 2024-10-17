package src.com.dhanush.learnJava.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

    private int i = 0;
    private int j = 0;

    /*
        In this program, when more than 1 method is using Synchronized then,
        it allows only 1 method to run and finish and let another method run
        after that, even it completely doesn't depend on each-other.
        In this time locks should be introduced so that it allows diff method
        to run simultaneously if it doesn't depend on each-other

        There is no need of synchronized keyword when locks are being used
     */
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

     public void incrementI(){
        lockForI.lock();
        i++;
        lockForI.unlock();
    }

     public void incrementJ(){
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

}

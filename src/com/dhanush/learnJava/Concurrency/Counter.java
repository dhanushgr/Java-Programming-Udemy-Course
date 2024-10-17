package src.com.dhanush.learnJava.Concurrency;

public class Counter {

    private int i = 0;

    /*
        If you put synchronized keyword infront of a method only one thread can
        run this method, untill then other threads needs to wait
     */
    synchronized public void increment() {
        i++;
        //This is not atomic because it has many steps in here
        //get i
        //increment
        //set i
    }

    public int getI() {
        return i;
    }

}

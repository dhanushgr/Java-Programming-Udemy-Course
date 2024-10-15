package src.com.dhanush.learnJava.MultiThreading;

import java.util.concurrent.*;

//Here we are creating a thread by using Callable instead of Runnable.
//It is done because we need to return back a result from this.
class CallableTask implements Callable<String> {

    private String name;

    //Constructor
    public CallableTask(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name ;
    }
}

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        //should use submit instead of execute.
        //execute is used in Runnable thread
        //submit s used in callable thread
        Future<String> welcomeFuture =
                executorService.submit(new CallableTask("Dhanush"));

        System.out.println("new callable Dhanush executed");
        String welcomeMessege = welcomeFuture.get();
        System.out.println(welcomeMessege);
        System.out.println("\n Main complete");

        executorService.shutdown();
    }
}

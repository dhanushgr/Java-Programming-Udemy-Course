package src.com.dhanush.learnJava.MultiThreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("Dhanush"),
                new CallableTask("Dhanu"),
                new CallableTask("Danny"));

        //This program outputs the result if it get any one of the result and
        // prints it down
        String result = executorService.invokeAny(tasks);

        System.out.println(result);

        executorService.shutdown();
    }
}

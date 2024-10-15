package src.com.dhanush.learnJava.MultiThreading;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        
        List<CallableTask> tasks = List.of(new CallableTask("Dhanush"),
                new CallableTask("Dhanu"),
                new CallableTask("Danny"));

        List<Future<String>> results = executorService.invokeAll(tasks);

        for (Future<String> result:results){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }
}

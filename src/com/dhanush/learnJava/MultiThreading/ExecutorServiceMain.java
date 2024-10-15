package src.com.dhanush.learnJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {

        // It only executes one Thread at a time
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        executorService.shutdown();
    }

}

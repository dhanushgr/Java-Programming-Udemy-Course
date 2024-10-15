package src.com.dhanush.learnJava.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {

    public static void main(String[] args) {

        // It only executes one Thread at a time
        //ExecutorService executorService = Executors.newSingleThreadExecutor();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));

        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));

        executorService.shutdown();
    }

}

//created a class with constructor for any number of tasks
class Task extends Thread{
    private int number;

    public Task(int number){
        this.number = number;
    }

    public void run(){
        System.out.println("Task "+ number +"started");
        for (int i = number*100; i<number*100 + 99; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask"+ number +"done");
    }
}

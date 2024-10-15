package src.com.dhanush.learnJava.MultiThreading;

//Creating a Thread by Extending
class Task1 extends Thread{
    /*
        The method should be as run(), you cant name it as you like.
        but, You should call this method by start() to start it as a thread.
        if you dont call it as start(), and call the method by run() in your
            main method, then it won't start as a thread, it will be like a
            normal method call
     */
    public void run(){  //SIGANTURE
        System.out.println("Task 1 has started");
        for (int i=1; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println("Task1 is Done");
    }
}

//Creating a class by interface
class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Task2 has started");
        for(int i=101; i<=200; i++){
            System.out.print(i + " ");
        }
        System.out.println(" \n Task 2 is done");
    }
}

public class CreatingThread {
    public static void main(String[] args) {

        /*
            you should create a new instance of the class task1
            and then call the start() method over that instance[which is task1]
         */
        System.out.println("Task1 kicked off");
        Task1 task1 = new Task1();
        task1.start();

        /*
            you should create new instance of the class Task2
            Create a new instance of Thread class[task2Thread] which takes
                class's instance as a parameter[Thread(task2)]
            call the start method on the instance of Thread.
         */
        //Task 2
        System.out.println("Task2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();


        //Task 3
        System.out.println("Task3 kicked off");
        for(int i=201; i<=300; i++){
            System.out.print(i + " ");
        }
        System.out.println(" \n Task 3 is completed");
    }
}

/*
    Thread can be created by 2 ways
    1. by extending thread:-    extends Thread
    2. by implementing the interface called runnable:-  implements Runnable
 */

package src.com.dhanush.learnJava.MultiThreading;

public class ThreadBasics {
    public static void main(String[] args) {

        //Task 1
        for(int i=1; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println(" \n Task 1 is completed");

        //Task 2
        for(int i=101; i<=200; i++){
            System.out.print(i + " ");
        }
        System.out.println(" \n Task 2 is completed");

        //Task 3
        for(int i=201; i<=300; i++){
            System.out.print(i + " ");
        }
        System.out.println(" \n Task 3 is completed");

    }
}

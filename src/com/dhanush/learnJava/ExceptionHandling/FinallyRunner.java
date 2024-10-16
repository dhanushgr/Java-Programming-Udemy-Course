package src.com.dhanush.learnJava.ExceptionHandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;
        int numb = 0;
        try {
            scanner = new Scanner(System.in);

            int[] numbers = {1, 2, 3, 4};
            numb = numbers[2];
            System.out.println(numb);

        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
            this is finally block which gets executed always. so, the main
            imp things are here, like close function of scanner or anything.
         */
        finally {
            System.out.println("before scanner close");
            scanner.close();
        }

        System.out.println("before ending main method");
    }
}

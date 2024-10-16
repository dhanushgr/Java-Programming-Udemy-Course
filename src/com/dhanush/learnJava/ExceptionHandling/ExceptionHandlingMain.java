package src.com.dhanush.learnJava.ExceptionHandling;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        //statements before exception runs smoothly
        System.out.println("hello exception");
        String str = null;
        str.length();   //exception occurred in this line
        //statements after exception won't run
        System.out.println("exception occurred");
    }
}

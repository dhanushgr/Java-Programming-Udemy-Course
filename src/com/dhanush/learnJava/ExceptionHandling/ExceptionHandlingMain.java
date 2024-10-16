package src.com.dhanush.learnJava.ExceptionHandling;

public class ExceptionHandlingMain {
    public static void main(String[] args) {
        //statements before exception runs smoothly
        Method1();
        //statements after exception won't run
        System.out.println("Main Ended");
    }

    private static void Method1() {
        Method2();
        System.out.println("Method1 ended");
    }

    private static void Method2() {
        System.out.println("hello exception");
        /*
            If these try catch block is used, the other methods are not going
            to know that an exception occurred here, if it did, it thinks that
             this method would have handled it, and it goes to execute its
             own statements. If you didn't mention it, then the whole process
              is stopped and not executed.
         */
        /*
            We can call many catch blocks in here for each exception.
            Exception is the super class of exception
         */
        try {
//            String str = null;
//            //exception occurred in this line
//            str.length();
            int[] number = {1,2,3};
            int numb = number[3];   //trying to access the 4th array
            System.out.println(numb);
        } catch (NullPointerException ex) {
            System.out.println("Matched NullPointerException");
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Matched ArrayIndexOutOfBoundException");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Matched Exception");
            e.printStackTrace();
        }
    }
}

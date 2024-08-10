package src.com.dhanush.JshellLearning;

public class sumOfNumbers_5 {

    public static void main(String[] args) {
        sumOfTheNumbers(2, 4);           //we can also see overloading in here
        sumOfTheNumbers(2, 3, 4);
    }


    public static void sumOfTheNumbers(int num1, int num2){      //A method which does the sum of two numbers
        System.out.printf("%d + %d = %d", num1, num2, num1+num2).println();
    }
    
    public static void sumOfTheNumbers(int num1, int num2,int num3){      
        System.out.printf("%d + %d + %d = %d", num1, num2, num3, num1+num2+num3).println();
    }

}
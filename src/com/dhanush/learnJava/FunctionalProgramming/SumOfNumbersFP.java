package src.com.dhanush.learnJava.FunctionalProgramming;

import java.util.List;

public class SumOfNumbersFP {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);   //This is going to be
        // used, for example, in this file.

        System.out.println("Sum of numbers without FP"+ PrintSumOfNumbers(numbers));
        System.out.println("Sum of numbers with FP" +PrintSumOfNumbersWithFP(numbers));

        System.out.println("sum of even set of numbers is " +PrintSumOfEvenNumbers(numbers));
        System.out.println(STR."sum of odd set of numbers is : \{PrintSumOfOddNumbers(numbers)}");

    }

    public static int PrintSumOfNumbers(List<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            sum = sum + number;     //mutation: the value of sum is changing continuously
        }
        return sum;
    }

    private static int PrintSumOfNumbersWithFP(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2);
        return sum;
    }

    /*
        2+4+6
    */
    public static int PrintSumOfEvenNumbers(List<Integer> numbers){
        int sum = numbers.stream()
                .filter(element -> element%2 == 0)
                .reduce(0, (number1, number2) -> number1 + number2 );
        return sum;
    }

    /*
        1+3+5
    */
    public static int PrintSumOfOddNumbers(List<Integer> numbers){
        int sum = numbers.stream()
                .filter(element -> element%2 == 1)
                .reduce(0, (number1,number2) -> number1 + number2);
        return sum;
    }

}

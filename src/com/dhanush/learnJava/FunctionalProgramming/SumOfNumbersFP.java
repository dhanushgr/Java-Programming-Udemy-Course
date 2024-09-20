package src.com.dhanush.learnJava.FunctionalProgramming;

import java.util.List;

public class SumOfNumbersFP {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        /*
            sum of numbers

        int sum = numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2);
         */
        int sum = SumWithFP(numbers);

        /*
            1+3+5
         */
        int sumOfOddNumbers = numbers.stream()
                .filter(number -> number%2 == 1)
                .reduce(0, (number1, number2) -> number1 + number2);

        /*
            2+4+6
         */
        int sumOfEvenNumbers = numbers.stream()
                .filter(number -> number%2 == 0)
                .reduce(0, (number1, number2) -> number1 + number2);


        System.out.println(sum);
        System.out.println(sumOfOddNumbers);
        System.out.println(sumOfEvenNumbers);

        System.out.println(PrintSumOfNumbers(numbers)); //normal method without FP


    }

    private static int SumWithFP(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, (number1, number2) -> number1 + number2);
        return sum;
    }

    public static int PrintSumOfNumbers(List<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            sum = sum + number;     //mutation: the value of sum is changing continuously
        }
        return sum;
    }
}

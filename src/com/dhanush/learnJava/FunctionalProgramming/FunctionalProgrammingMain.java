package src.com.dhanush.learnJava.FunctionalProgramming;
/*
    definition: giving first class citizen to functions

 */

import java.util.List;

public class FunctionalProgrammingMain {
    public static void main(String[] args) {

        /*
            Lists which are going to be used in this program, as an
            argument/parameter for some methods
         */
        List<String> words = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> numbers2 = List.of(6, 3, 8, 2, 9, 8, 6);
        List<String> words2 = List.of("Apple", "Bat", "Cat", "Dog", "Eat");
        //For .filter(), this String is used

        //calling methods
        PrintBasic(words);
        System.out.println();
        PrintWithFP(words);
        System.out.println();
        PrintNumbersWithFP(numbers);
        System.out.println();
        PrintNumbersWithFilterFP(words2);
        System.out.println();
        PrintOddNumbers(numbers);
        System.out.println();
        PrintEvenNumbers(numbers);

        /* all this statements are written because the fucntions have "Void"
        as a return type, remaining functions which doesn't use sout
        statements are using int/anyting as a return type */
        System.out.println("Sum of numbers without FP"+ PrintSumOfNumbers(numbers));
        System.out.println("Sum of numbers with FP" +PrintSumOfNumbersWithFP(numbers));
        System.out.println("sum of even set of numbers is " +PrintSumOfEvenNumbers(numbers));
        System.out.println(STR."sum of odd set of numbers is : \{PrintSumOfOddNumbers(numbers)}");

        //calling methods
        SortNumbers(numbers2);
        System.out.println();
        DistinctNumbers(numbers2);
        System.out.println();
        SortedAndDistinctNumbers(numbers2);
        System.out.println();
        PrintSquaresOfDistinctNumbers(numbers2);

    }

    public static void PrintBasic(List<String> words){
        for (String string:words){
            System.out.println(string);
        }
    }

    public static void PrintWithFP(List<String> words){
        words.stream().forEach(
                element -> System.out.println(element)      //action
        );
    }

    public static void PrintNumbersWithFP(List<Integer> numbers){
        numbers.stream().forEach(
                element -> System.out.println(element)
        );
    }

    public static void PrintNumbersWithFilterFP(List<String> words2){
        words2.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }

    public static void PrintOddNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(element -> element%2 == 1)
                .forEach(element ->System.out.println(element));
    }

    public static void PrintEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(element -> element%2 == 0)
                .forEach(element ->System.out.println(element));
    }

    public static int PrintSumOfNumbers(List<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            sum = sum + number;     //mutation: the value of sum is changing
            // continuously, but in FP we avoid mutation of variable.
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

    public static void SortNumbers(List<Integer> numbers2){
        numbers2.stream()
                .sorted()
                .forEach(element -> System.out.println(element));
    }

    public static void DistinctNumbers(List<Integer> numbers2){
        numbers2.stream()
                .distinct()
                .forEach(element -> System.out.println(element));
    }

    public static void SortedAndDistinctNumbers(List<Integer> numbers2){
        numbers2.stream()
                .distinct()
                .sorted()
                .forEach(element -> System.out.println(element));
    }

    public static void PrintSquaresOfDistinctNumbers(List<Integer> numbers2){
        numbers2.stream()
                .distinct()
                .map(e -> e*e)      //This is an intermediate function which
                // squares the element, and then let it proceed with further
                // function
                .forEach(e -> System.out.println(e));
    }

}

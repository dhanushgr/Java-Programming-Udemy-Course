package src.com.dhanush.learnJava.FunctionalProgramming;
/*
    definition: giving first class citizen to functions

 */

import java.util.List;

public class FunctionalProgrammingMain {
    public static void main(String[] args) {

        List<String> words = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<String> words2 = List.of("Apple", "Bat", "Cat", "Dog", "Eat");

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

}

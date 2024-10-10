package src.com.dhanush.Exercise.Set9;

import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgrammingMagic {
    public static void main(String[] args) {

        //Required parameters for the methods to run
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        int n = 5;
        List<String> courses = List.of("Math", "English", "History", "Physics");

        //calling methods
        System.out.println("Odd Numbers: " + filterOddNumbers(numbers));
        System.out.println("Cubes of first " + n + " numbers: " + getCubesOfFirstNNumbers(n));
        System.out.println("Course name character counts: " + getCourseNameCharacterCount(courses));
        System.out.println("Sum of squares: " + sumOfSquares(numbers));
        System.out.println("Max even number: " + findMaxEvenNumber(numbers));

    }

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */

    /*
                Examples
        Input: [1, 2, 3, 4, 5] Output: [1, 3, 5]
        Input: [6, 7, 8, 9, 10] Output: [7, 9]
        Input: [-3, -2, -1, 0, 1, 2, 3] Output: [-3, -1, 1, 3]
    */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {

        // Write your code here

        return numbers.stream()
                .filter(e -> e%2 != 0)
                .toList();

    }


    /**
     * This method generates the cubes of the first n natural numbers.
     * @param n The number of natural numbers for which cubes are to be calculated.
     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
     */

    /*
        Examples
            Example 1
            Input: n = 5 Return Value: [1, 8, 27, 64, 125]
            Example 2
            Input: n = 3 Return Value: [1, 8, 27]
            Example 3
            Input: n = 0 Return Value: []
     */
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        return IntStream.range(1,n+1)
                .map(e -> e*e*e)
                .boxed()
                .toList();

    }


    /*
        Examples:-
            Example 1
            Input:
            List<String> courses = List.of("Math", "English", "History", "Physics");
            Output:
            List<Integer> result = List.of(4, 7, 7, 7);
            Example 2
            Input:
            List<String> courses = List.of(); (An empty list)
            Output:
            List<Integer> result = List.of(); (An empty list)
            Example 3
            Input:
            List<String> courses = null; (A null list)
            Output:
            List<Integer> result = List.of(); (An empty list)
     */
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        // TODO: Write code
        if (courses == null) {
            return List.of();
        }
         return courses.stream()
                 .map(String::length)
                 .toList();
    }

    /*
    Examples
        Let's consider the following examples:
        Example 1:
        Input:
        List<Integer> numbers = List.of(1, 2, 3);
        Output:
        long sum = sumOfSquares(numbers);
        System.out.println(sum); // Prints: 14
        Example 2:
        Input:
        List<Integer> numbers = null;
        Output:
        long sum = sumOfSquares(numbers);
        System.out.println(sum); // Prints: 0
        Example 3:
        Input:
        List<Integer> numbers = List.of();
        Output:
        long sum = sumOfSquares(numbers);
        System.out.println(sum); // Prints: 0
     */
    public static long sumOfSquares(List<Integer> numbers) {

        // Check if the list is null. If so, return 0.
        if(numbers == null){
            return 0;
        }

        // Stream over the list of numbers, find squares and sum them up

           return numbers.stream()
                .mapToLong(e -> e*e)
                .sum();

        /*
                    OR
        return numbers.stream()
                .map(e -> e*e)
                .reduce(0,(num1,num2) -> num1+num2);
         */
    }

    /*
        Examples
            Let's take a few examples to understand the problem and the solution.
            Example 1:
            Input: [23, 45, 67, 12, 34, 56, 78]
            Output: 78
            Example 2:
            Input: [1, 3, 5, 7, 9]
            Output: 0
            Example 3:
            Input: null
            Output: 0
     */
    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here
        if(numbers == null){
            return 0;
        }
        return numbers.stream()
                .filter(e -> e%2 == 0)
                .max(Integer::compare)
                 .orElse(0);
    }
}

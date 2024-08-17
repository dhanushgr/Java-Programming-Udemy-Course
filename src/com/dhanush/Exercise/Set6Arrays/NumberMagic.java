package src.com.dhanush.Exercise.Set6Arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {

        ArrayList<Integer> factor = new ArrayList<>();

        if(number <= 0){
            return factor;
        }

        for(int i = 1; i<= number; i++) {
            if (number % i == 0) {
                factor.add(i);
            }
        }
        return factor;
    }

    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     *
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        ArrayList<Integer> multiples = new ArrayList<>();

        if(number <= 0 || limit <= 0){
            return multiples;
        }

        for(int i=1; i<limit; i++){
            if(number * i < limit){
                multiples.add(number*i);
            }
        }
        return multiples;
    }

    //Alternative method(better code)

//public List<Integer> determineMultiples(int number, int limit) {
//
//    ArrayList<Integer> multiples = new ArrayList<>();
//
//    if(number <= 0 || limit <= 0){
//        return multiples;
//    }
//
//    for(int i=1; number * i < limit; i++){
//            multiples.add(number*i);
//    }
//    return multiples;
//}

}


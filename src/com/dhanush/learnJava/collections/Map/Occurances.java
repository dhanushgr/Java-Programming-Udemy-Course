/*
    Problem Statement:
        How many occurances of the characters and words in a String with the help of HashMap
 */

package src.com.dhanush.learnJava.collections.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Occurances {
    public static void main(String[] args) {
        String str = "This is an awesome occasion . This was the best occasion I had in years";

        Map<Character, Integer> occurances = new HashMap<>();

        /*
            this is used to store the string in the form of characters
            in a new array of type characters.
            .toCharArray() converts the String to a character array
         */
        char[] characters = str.toCharArray();
        System.out.println(characters.length);
        System.out.println(characters);

        for (char character : characters) {
            /*
                checks if the key(character(like A or B)) has any value in it.
                .get(key): returns the value of that key. It will return an integer type
             */
            Integer integer = occurances.get(character);
            /*
                if there is no value present for that key that is null
                (there is no key present, so should create a new key with the value)
                here .put() creates a new key and value
             */
            if (integer == null) {
                occurances.put(character, 1);   //sets the value as 1
            } else {                    //if the key is present with some value
                occurances.put(character, integer + 1);     //then increment that value by 1 (here .put() updates the value of the key to +1)
            }
        }

        System.out.println(occurances);


        //StringOccurances
        Map<String, Integer> stringOccurances = new HashMap<>();

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        for (String word : words) {
            Integer integer = stringOccurances.get(word);
            if (integer == null) {
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer + 1);
            }
        }

        System.out.println(stringOccurances);
    }
}

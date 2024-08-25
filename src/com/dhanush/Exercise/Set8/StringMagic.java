/*
    Coding Exercise - Anagram Checker
    You are given two strings str1 and str2. Your task is to determine if str1 and str2 are anagrams of each other.
    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using
    all the original letters exactly once. For example, the word "listen" is an anagram of "silent", "hello" and
    "olelh" are anagrams.
    You need to implement the areAnagrams(String str1, String str2) method of the StringMagic class, which returns
    true if str1 and str2 are anagrams of each other, and false otherwise.

    Java Library Methods
    Few methods would be helpful for you:
    string.toLowerCase() - Converts all of the characters in this String to lower case
    string.toCharArray() - Converts this string to a new character array.
    Arrays.sort(charArray) - Sorts the specified array into ascending numerical order.
    Arrays.equals(charArray1, charArray2) - Returns true if the two specified arrays of chars are equal to one another.
 */

package src.com.dhanush.Exercise.Set8;

import java.util.Arrays;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        String stringLower1 = str1.toLowerCase();
        String stringLower2 = str2.toLowerCase();

        char[] string1 = stringLower1.toCharArray();
        char[] string2 = stringLower2.toCharArray();

        Arrays.sort(string1);
        Arrays.sort(string2);

        if (Arrays.equals(string1, string2)) {
            return true;
        }

        return false;
    }

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"
        if(sentence == null){
            return "INVALID";
        }

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string
        if(sentence.isEmpty()){
            return "";
        }

        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.
        String[] words = sentence.split(" ");   //splits the sentence to words


        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder reversedSentence = new StringBuilder();

        // TODO: Loop through each word in the words array.
        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.
        for(String word: words){
            StringBuilder reversedWord = new StringBuilder(word).reverse(); //reversedWord is created of type
            // StringBuilder, which reverses the current word and insert it to reversedWord
            reversedSentence.append(reversedWord).append(" "); //the reversedWord is appended(added) to the
            // reversedSentence, then adds a space after the word.
        }

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        return reversedSentence.toString().trim();  // .trim() is used to trim the extra space at end of the sentence
        // which was created by reversedSentence.append(reversedWord).append(" ");

    }

}



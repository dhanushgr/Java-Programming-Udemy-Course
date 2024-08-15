package src.com.dhanush.Exercise.Set6Arrays;

public class StringMagic {
    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {    //should output a String type

        // TODO: Write your code here

        if(sentence.isEmpty()){     //for edge case, if the string is empty
            return "";
        }
        String longestWord = "";    //considering the longestWord is empty at the beginning
        String[] words = sentence.split(" ");   //this finds the blank spaces and consider to split it there.
                                                        //we can make it split where ever we want, it depends on what input you give to the split(regex:"")
        for(String word:words){     //Enhanced for loop
            if(word.length()>longestWord.length()){     //if the word of that sentence is longer
                longestWord = word;                     //make that word as the longest word
            }
        }
        return longestWord;             //returning the longestWord which is of type String.
    }
}
package src.com.dhanush.Exercise.Section17_Set5;

/**
 * This method counts the number of uppercase letters in a given string.
 *
 * @param str The string to count uppercase letters in.
 * @return The number of uppercase letters in the string.
 */

public class StringMagic {
    public int countUppercaseLetters(String str) {
        int count = 0;
        if(!str.isEmpty()){
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    count++;
                }
            }
            return count;       //after counting how many upper cases are there in it, this return total uppercases
        }
        return 0;               //OR return count;  When string is empty this return 0.
    }

    //Alternate Code

//public class StringMagic {
//    public int countUppercaseLetters(String str) {
//        int count = 0;
//        if (str.isEmpty()) {
//            return count;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);               //This stores the char at a variable
//            if (Character.isUpperCase(c)) {       //passes the variable here
//                count++;
//            }
//        }
//        return count;
//    }
//}

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    // Alternate code
//    public boolean hasConsecutiveDuplicates(String str) {
//
//        if (str.isEmpty() || str.length() == 1) {
//            return false;
//        }
//
//        for (int i = 0; i < str.length() - 1; i++) {
//            char currentChar = str.charAt(i);
//            char nextChar = str.charAt(i + 1);
//
//            if (currentChar == nextChar) {
//                return true;
//            }
//        }
//        return false;
//    }

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        if(!str.isEmpty()){
            for(int i = str.length()-1; i>=0; i--){
                if(Character.isDigit(str.charAt(i))){
                    return Character.getNumericValue(str.charAt(i));
                }
            }
        }
        return -1;
    }

    //Alternative code
//
//    public int getRightmostDigit(String str) {
//
//        if (str.isEmpty()) {
//            return -1;
//        }
//
//        int length = str.length();
//
//        for (int i = length - 1; i >= 0; i--) {
//            char c = str.charAt(i);
//
//            if (Character.isDigit(c)) {
//                return Character.getNumericValue(c);
//            }
//        }
//        return -1;
//    }

}





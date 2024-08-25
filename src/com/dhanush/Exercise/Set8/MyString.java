package src.com.dhanush.Exercise.Set8;

public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }

    /*
        checks the given character is valid Hexadecimal or not
        only checks the character not the digit
     */
    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        if((ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')){
            return true;
        }
        return false;
    }

    /*
        checks the string is valid Hexadecimal or not
        checks both the character and digit
     */
    public boolean isHexadecimal() {
        // Write your code here
        if(str == null || str.isEmpty()){
            return false;
        }

        char[] chars = str.toCharArray();

        for (char ch : chars ){
            if(!Character.isDigit(ch) && !isHexadecimalChar(ch)){
                return false;
            }
        }
        return true;
    }

}

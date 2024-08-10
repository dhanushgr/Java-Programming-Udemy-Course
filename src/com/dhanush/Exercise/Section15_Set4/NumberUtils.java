package src.com.dhanush.Exercise.Section15_Set4;

public class NumberUtils {

    //Problem 1:
    public int getLastDigit(int number) {
        // Write your code here
        if(number>=0){
             if(number%10!=0){
                 return number%10;  //returning the last digit if the input is between 1 to 9
             }
             return 0;      //returning 0 for input 0
        }
        return -1;          //returning -1 for negative numbers
    }

    /**
     * This method calculates and returns the number of digits in a given integer.
     * If the number is negative, it returns -1.
     * If the number is zero, it returns 1 as zero is considered to have one digit.
     * @param number: an integer
     * @return number of digits in number, or -1 if number is negative, or 1 if number is zero.
     */
    //Problem 2:
    public int getNumberOfDigits(int number) {
        // Write your code here
        int count =0;
        
        if(number<0){
            return -1;
        }
        
        if(number == 0){
            return 1;
        }
        
        do{
            number = number/10;
            count++;
        }while(number != 0);
        return count;
    }

    //problem 3:
    public int getSumOfDigits(int number) {
        // Write your code here
        int lastDigit = 0;
        int addUpNumber = 0;
        
        if(number<0){
            return -1;
        }
        
        if(number == 0){
            return 0;
        }
        
        while(number!=0){
            lastDigit = number%10;
            number = number/10;
            addUpNumber = lastDigit + addUpNumber;
        }
        return addUpNumber;
    }
}
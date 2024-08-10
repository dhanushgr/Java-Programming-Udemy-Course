package src.com.dhanush.Exercise.Section15_Set4;

public class NumberUtilsMain {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();

        System.out.println(numberUtils.getLastDigit(8678));     //by using number%10
        System.out.println(numberUtils.getNumberOfDigits(8678));        //by increasing count
        System.out.println(numberUtils.getSumOfDigits(8678));   //use number&10 to get lastDigit and use number/10 to get rid of lastDigit.
        System.out.println(numberUtils.reverseNumber(8678));            //ReverseNumber * 10 , it increases the 10's place.
    }
}

package src.com.dhanush.Exercise.Section15_Set4;

public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        int factorailNumber = 1;
        
        if(number>=0 && number<2){
            return 1;
        }
        
        if(number>=2){
            for(int i=2;i<=number;i++){
                factorailNumber = factorailNumber* i;
            }
            return factorailNumber;
        }
        else
            return -1;
    }
}
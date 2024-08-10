package src.com.dhanush.Exercise.Section13_Set3;

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        if(year > 0){                                             //year should be greater than 0 for condition 
            if(year%4 == 0){                                      //first check if it is divisible by 4
                if(year%400 == 0 || year%4 == 0 && year%100 != 0){ //checking if it is divisible by 4 , 400, but not by 100.
                                                                   //If I dint put divisible by 4 , 2004 wont be here.so its a must to put it in
                    return true;                                   
                }
            }
        }
        return false;
    }
}
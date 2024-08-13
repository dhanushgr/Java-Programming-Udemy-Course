package src.com.dhanush.learnJava.Arrays;

public class StringArray {

    private String[] daysOfWeek;

    public StringArray(String[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public void printAllDaysOfWeek(){
        for(String days:daysOfWeek){
            System.out.println(days);
        }
    }

    public void printAllDaysOfWeekInBackwards(){
        for(int i = daysOfWeek.length-1; i>=0; i--){
            System.out.println(daysOfWeek[i]);
        }
    }

    public void longestDay(){
        String  daysWithMostCharacter = daysOfWeek[0];
        for(String day: daysOfWeek){
            if(day.length()>daysWithMostCharacter.length()){
                daysWithMostCharacter = day;
            }
        }
        System.out.println(daysWithMostCharacter);
    }


}

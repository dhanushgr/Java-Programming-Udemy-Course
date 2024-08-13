package src.com.dhanush.learnJava.Arrays;

public class StringArrayMain {
    public static void main(String[] args) {
        String[] daysOfWeek = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        StringArray stringArray = new StringArray(daysOfWeek);

        stringArray.printAllDaysOfWeek();
        stringArray.printAllDaysOfWeekInBackwards();
        stringArray.longestDay();

        }
}

package com.dhanush.learnJava.conditionals;

public class WeekDay {

    int day;
    public static void main(String[] args) {
        System.out.println(isWeekDay(6));
    }

    public static boolean isWeekDay(int day){
        boolean ans = true;
        switch (day) {
            case 0:
            case 6:
                ans = false;
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                ans = true;
                break;
            default:
                break;
        }
        return ans;
    }
}

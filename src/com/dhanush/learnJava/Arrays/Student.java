package src.com.dhanush.learnJava.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marks;

    //default constructor
    public Student() {
    }

    //constructor with parameters
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public void printAllNumberOfMarks(){
        for(int mark:marks){
            System.out.println(mark);
        }
    }
    public int getNumberOfMarks(){
            return marks.length;
    }

    public int getTotalSumOfMarks(){
        int totalMarks = 0;
        for (int i = 0 ;i<marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }
        return totalMarks;
    }

    public int getMinimumMarks(){
        int min =  marks[0];
        for(int i = 0; i<marks.length; i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
        return min;
    }

    public int getMaximumMarks(){
        int max =  marks[0];
        for(int i =0; i<marks.length; i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        return max;
    }


    //BigDecimal is used here because of its accuracy compared to float or double. all financial clculations are done by BigDecimals
    public BigDecimal getAverageMarks(){
        //My solution before , BigDecimal avgMarks = new BigDecimal(getTotalSumOfMarks()/getNumberOfMarks());
        //return avgMarks;

        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
        //precision 3 digits and rounding mode up or down

    }

}
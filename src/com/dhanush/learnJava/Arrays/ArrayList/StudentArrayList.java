package src.com.dhanush.learnJava.Arrays.ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentArrayList {
    private String name;
    private ArrayList<Integer> marks= new ArrayList<>();

    //defaultConstructor
    public StudentArrayList(){
    }

    //constructor
    public StudentArrayList(String name, int... marks) {        //this is taking input of marks in a variable argument way.
        this.name = name;
        for(int mark:marks){
            this.marks.add(mark);                   //this code is written especially because of variable arguments . this code takes every marks and adds up to the marks ArrayList
        }                                           //if we dint use variable arguments we could have just used this.marks = marks;
    }

    public void printAllNumberOfMarks(){
        for(int mark:marks){
            System.out.println(mark);
        }
    }
    public int getNumberOfMarks(){
        return marks.size();
    }

    public int getTotalSumOfMarks(){
        int totalMarks = 0;
        for (Integer mark : marks) {
            totalMarks = totalMarks + mark;
        }
        return totalMarks;
    }

    public int getMinimumMarks(){
        return Collections.min(marks);
    }

    public int getMaximumMarks(){
        return Collections.max(marks);
    }

    //BigDecimal is used here because of its accuracy compared to float or double. all financial calculations are done by BigDecimals
    public BigDecimal getAverageMarks(){
        //My solution before , BigDecimal avgMarks = new BigDecimal(getTotalSumOfMarks()/getNumberOfMarks());
        //return avgMarks;

        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
        //precision 3 digits and rounding mode up or down

    }

    public void addNewMark(int mark){
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
    @Override
    public String toString() {                              //This is a toString method used to print the content of the class
        return STR."StudentArrayList{name='\{name}', marks=\{marks}}";   //This is the new update in java 22. STR method.
                                                                        //we could use \{name} instead of "+name+" like this code below.

//        return "StudentArrayList{" +
//                "name='" + name + '\'' +
//                ", marks=" + marks +
//                '}';
    }

}

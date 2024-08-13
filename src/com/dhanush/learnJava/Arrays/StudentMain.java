package src.com.dhanush.learnJava.Arrays;

import java.math.BigDecimal;

public class StudentMain {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 90;
//        marks[1] = 96;
//        marks[2] = 89;
        // OR

        int[] marks = {90,96,89};
        Student student = new Student("dhanush", marks);
        student.printAllNumberOfMarks();
        System.out.println("numberOfMarks "+student.getNumberOfMarks());
        System.out.println("total sum is "+student.getTotalSumOfMarks());
        System.out.println("max is "+student.getMaximumMarks());
        System.out.println("min is "+student.getMinimumMarks());
        System.out.println("avg is "+student.getAverageMarks());
    }
}
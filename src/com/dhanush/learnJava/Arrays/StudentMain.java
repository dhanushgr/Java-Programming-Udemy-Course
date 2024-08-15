package src.com.dhanush.learnJava.Arrays;

public class StudentMain {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        marks[0] = 90;
//        marks[1] = 96;
//        marks[2] = 89;
        // OR

        //int[] marks = {90,96,89};         this was used when you know the whole marks, and store it in a array , and send that array as a input to the object.
        Student student = new Student("dhanush", 99, 90, 87, 67);  //inputting the marks manually by the use of variable arguments, or else i would have mentioned "marks", which is the array.
        student.printAllNumberOfMarks();
        System.out.println("numberOfMarks "+student.getNumberOfMarks());
        System.out.println("total sum is "+student.getTotalSumOfMarks());
        System.out.println("max is "+student.getMaximumMarks());
        System.out.println("min is "+student.getMinimumMarks());
        System.out.println("avg is "+student.getAverageMarks());
    }
}
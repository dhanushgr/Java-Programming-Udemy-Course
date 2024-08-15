package src.com.dhanush.learnJava.Arrays.ArrayList;

public class StudentArrayListMain {
    public static void main(String[] args) {
        StudentArrayList studentArrayList = new StudentArrayList("Dhanush", 78, 23, 78);

        //int[] marks = {90,96,89};         this was used when you know the whole marks, and store it in a array , and send that array as a input to the object.
        studentArrayList.printAllNumberOfMarks();
        System.out.println("numberOfMarks "+studentArrayList.getNumberOfMarks());
        System.out.println("total sum is "+studentArrayList.getTotalSumOfMarks());
        System.out.println("max is "+studentArrayList.getMaximumMarks());
        System.out.println("min is "+studentArrayList.getMinimumMarks());
        System.out.println("avg is "+studentArrayList.getAverageMarks());

        System.out.println(studentArrayList);

        studentArrayList.addNewMark(56);
        System.out.println();

        System.out.println(studentArrayList);   //This uses toString method to output the contents of the class.
                                                //If you don't use toString method , it will return the hashmap address

        studentArrayList.removeMarkAtIndex(1);

        System.out.println(studentArrayList);
    }
}

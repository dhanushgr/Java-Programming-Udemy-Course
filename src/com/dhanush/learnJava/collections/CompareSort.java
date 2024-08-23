package src.com.dhanush.learnJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareSort {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"dhanush"), new Student(2, "groot"), new Student(3,"evans"));

        List<Student> studentArrayList = new ArrayList<>(students);

        System.out.println(studentArrayList);
        //shuffles the ArrayList elements
        Collections.shuffle(studentArrayList);
        System.out.println(studentArrayList);
        //sorts the ArrayList elements based on their id.
        //for reference, check the compareTo() class in student class which implements Comparable Interface
        //for sorting elements of custom type[like Student- user defined class or not primitive type]:
            //you should mention what they are comparing to , so we should implement te Comparable Interface

        //for reference, check out Integer class which implements Comparable interface by default,
        // so we don't have to implement comparable again for it.
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
    }

}

package src.com.dhanush.learnJava.collections.list;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        String names1 ="Girish";

        List<Student> students = List.of(new Student(1, "Dhanush"),
                                         new Student(2, "Groot"),
                                         new Student(3, "Stark"));
        List<Student> studentsArrayList = new ArrayList<>(students);
        System.out.println(studentsArrayList);

        Student student4 = new Student(4, "girish");
        studentsArrayList.add(student4);

        System.out.println(studentsArrayList);

    }
}

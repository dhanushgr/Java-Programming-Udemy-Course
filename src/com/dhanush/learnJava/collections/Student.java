package src.com.dhanush.learnJava.collections;

public class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."Student{id=\{id}, name='\{name}'}";
    }

    /*
        we compare the id present in this class and
        the id which they input in main method.
     */
    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
    }
}

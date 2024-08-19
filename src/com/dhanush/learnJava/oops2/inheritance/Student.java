package src.com.dhanush.learnJava.oops2.inheritance;

public class Student extends Person{

    private String collageName;
    private int yearOfStudying;
    private String usnNumber;

    public Student(){

    }

    public Student(String collageName, int yearOfStudying, String usnNumber) {
        this.collageName = collageName;
        this.yearOfStudying = yearOfStudying;
        this.usnNumber = usnNumber;
    }

    public Student(String name, String email, String phoneNumber, String collageName, int yearOfStudying, String usnNumber) {
        super(name, email, phoneNumber);
        this.collageName = collageName;
        this.yearOfStudying = yearOfStudying;
        this.usnNumber = usnNumber;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    public String getUsnNumber() {
        return usnNumber;
    }

    public void setUsnNumber(String usnNumber) {
        this.usnNumber = usnNumber;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    @Override
    public String toString() {
        return STR."Student{collageName='\{collageName}', yearOfStudying=\{yearOfStudying}, usnNumber='\{usnNumber}'}";
    }

}

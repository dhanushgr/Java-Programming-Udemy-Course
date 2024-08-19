package src.com.dhanush.learnJava.oops2.inheritance;

public class Employee extends Person{
    private String title;
    private String employer;
    private String employeeGrade;
    private long salary;

    public Employee(){

    }

    public Employee(String name, String email, String phoneNumber, String title, String employer, String employeeGrade, long salary) {
        super(name, email, phoneNumber);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(String employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    should mention ---super.toString()--- in this sub class
    if we need to get the super class's info printed while we call this sub class.
     */
    @Override
    public String toString() {
        return STR."\{super.toString()}title='\{title}', employer='\{employer}', employeeGrade='\{employeeGrade}', salary=\{salary}}";
    }
}

package src.com.dhanush.learnJava.oops2.inheritance;

public class StudentMain {
    public static void main(String[] args) {
        Person person = new Person("Hemanth","fjdsakl@gmail.com","23890");
        Student student = new Student("Dhanush","uroiepwq@gmai.com","7890","IIT",3,"4mha289");
        Student student1 = new Student("MIT",1,"4mh20is");
        Employee employee = new Employee();

        System.out.println(person);
        System.out.println(student);
        System.out.println(student1);

        employee.setTitle("Developer");
        employee.setEmployeeGrade("A");
        employee.setSalary(700000);
        employee.setEmployer("naveen");
        employee.setName("Hemanth");
        employee.setEmail("fhlkds@gmail.com");
        employee.setPhoneNumber("6789687");

        System.out.println(employee);
    }
}

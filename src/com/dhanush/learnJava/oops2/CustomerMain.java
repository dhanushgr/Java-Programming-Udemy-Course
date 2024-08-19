// OBJECT COMPOSITION - object inside an object (eg: customer is an object which is taking homeAddress(also an object) as an argument)

package src.com.dhanush.learnJava.oops2;

public class CustomerMain {
    public static void main(String[] args) {
        /*
        We should create both objects in here.
            - Address's object
            - Customer's object
        Till now we were just used to
            - creating 1 Class's object in the main method.(eg: customer only)
            - connect only one class of java to the main file(eg: Customer.java --> CustomerMain.java)
        In this we are connecting 2 classes to Main method. (Customer.java, Address.java --> CustomerMain.java)
         */


        //creating the object of data type Address(which is a new class and serves as a data type like String),
        // to input this object as an argument in the customer object.
        Address homeAddress = new Address("Mysore","Vivekananda nagar", "570023");
        Address workAddress = new Address("Banglore", "HSR layout", "560045");

        Customer customer = new Customer("Dhanush",homeAddress);

        System.out.println(customer);       //without workAddress
        customer.setWorkAddress(workAddress);   //setting workAddress
        System.out.println(customer);       //with workAddress
    }
}

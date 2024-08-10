package src.com.dhanush.learnJava.oops.encapsulation;

public class BikeMain {
    public static void main(String[] args) {
        Bike honda = new Bike();
        Bike ducati = new Bike(90);     //This will directly set the speed to 90 with out calling the obj.setSpeed() method.
        Bike pulsar = new Bike();             //For this obj the speed will be directly set to 5. which is mention in the Bike class DefaultConstructor

        honda.setSpeed(45);             //sets the speed of honda from 5 to 45

        System.out.println(honda.getSpeed());
        System.out.println(ducati.getSpeed());
        System.out.println(pulsar.getSpeed());

        
    }
}
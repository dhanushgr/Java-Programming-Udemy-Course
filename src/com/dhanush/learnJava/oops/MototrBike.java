package src.com.dhanush.learnJava.oops;

public class MototrBike {

    int speed;              //these are INSTANCE VARIABLE
    int highestSpeed;       //these are the variables in this class.
    char ClassOfBike;

    void start(){
        System.out.println("Motor Bike Started");
    }

    void clutch(){
        System.out.println("Applied cluth");
    }

    void accelerate(){
        System.out.println("Apllying accelerator");
    }

    void brake(){
        System.out.println("Applying brake");
    }

    void stop(){
        System.err.println("Motor Bike Stopped");
    }

}
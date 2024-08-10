package src.com.dhanush.learnJava.oops;

public class MotorBikeMain {

    public static void main(String[] args){
        MototrBike honda = new MototrBike();    //honda is the object from the class MotorBike
        MototrBike bmw = new MototrBike();      //bmw is the object

        honda.start();                          //calling methods of the diff class by creating their class'sobject
        // honda.accelerate();
        // honda.clutch();
        // honda.brake();
        honda.stop();

        bmw.start();
        bmw.stop();

        honda.speed = 10;                        //all of this are INSTANCE VARIABLE. means objects variable.
        honda.highestSpeed= 150;                //This variables cant be called without appendng with the object of that class.
        honda.ClassOfBike = 'B';    

        int speed = 23;
        System.out.println(speed);              //This is normal variable of this class.
        System.out.println(honda.speed);        //This is the instance variable.
    }

}

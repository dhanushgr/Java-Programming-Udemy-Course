package src.com.dhanush.learnJava.oops2;

public class FanMain {
    public static void main(String[] args) {
        Fan fan = new Fan("steel",34.5,"blue");
        System.out.println(fan);    //this will call the toString() method of this object by default
        fan.switchOn();
        fan.setSpeed(50);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}

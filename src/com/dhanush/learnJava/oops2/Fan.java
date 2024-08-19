package src.com.dhanush.learnJava.oops2;

public class Fan {
    //State or method variable
    //below parameter is not changed in most of the cases, so set these variables when creating constructor.
    private String make;
    private double radius;
    private String color;
    //these parameters could be changed.
    private boolean isOn;
    private int speed;

    public Fan(){

    }

    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed(0);
    }

    @Override
    public String toString() {
        return STR."Fan{make='\{make}', radius=\{radius}, color='\{color}', isOn=\{isOn}, speed=\{speed}}";
    }
}

/*
    In this example there is no connection between a bird and airplane,
    but share an interface
 */

package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.fly;

public class FlyMain {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable object : flyingObjects){
            object.fly();
        }
    }
}

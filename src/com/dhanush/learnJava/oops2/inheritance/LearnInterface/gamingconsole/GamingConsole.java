package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.gamingconsole;

public interface GamingConsole {

    /*
        By default, all the methods in interface are abstract
        that means all these methods MUST be present in the subclasses
     */

    public void up();
    public void down();
    public void left();
    public void right();

}

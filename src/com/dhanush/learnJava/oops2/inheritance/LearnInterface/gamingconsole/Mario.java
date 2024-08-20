package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.gamingconsole;

public class Mario implements GamingConsole {
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("crouch");
    }

    @Override
    public void left() {
        System.out.println("move left");
    }

    @Override
    public void right() {
        System.out.println("move right");
    }
}

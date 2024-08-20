package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.gamingconsole;

public class Chess implements GamingConsole {
    @Override
    public void up() {
        System.out.println("move the chess piece forward");
    }

    @Override
    public void down() {
        System.out.println("move the chess piece backward");
    }

    @Override
    public void left() {
        System.out.println("move the chess piece to the left");
    }

    @Override
    public void right() {
        System.out.println("move the chess piece to the right");
    }
}

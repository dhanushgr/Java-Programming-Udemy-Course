package src.com.dhanush.learnJava.oops2;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 10);

        System.out.println(rectangle1);
        System.out.println(rectangle1.getBreadth());
        System.out.println(rectangle1.getLength());
        rectangle1.setLength(20);
        rectangle1.setBreadth(10);
        System.out.println(rectangle1);

    }
}

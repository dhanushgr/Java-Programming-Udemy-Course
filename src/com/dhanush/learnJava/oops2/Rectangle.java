package src.com.dhanush.learnJava.oops2;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){

    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int perimeter(){
        return 2 * (this.length + this.breadth);
    }

    public int area(){
        return length * breadth;
    }

    //this STR."" method only works for Java 22 and above.
    //added perimeter() and area() to the toString() method manually(It will not auto generate)
    @Override
    public String toString() {
        return STR."Rectangle{length=\{length}, breadth=\{breadth}, perimeter=\{perimeter()}, area=\{area()}}";
    }

}

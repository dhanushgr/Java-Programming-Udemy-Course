package src.com.dhanush.Exercise.Set7;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 5.0);
        circle.displayInfo();

        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        rectangle.displayInfo();
    }
}

abstract class Shape {
    protected String name;

    /*
        this is a constructor of the super class, which takes name as the argument
     */
    public Shape(String name) {
        this.name = name;
    }

    //this is the abstract method, which should be defined in the sub class(circle and rectangle)
    public abstract double calculateArea();

    /*
        this is a concrete method
        this method displayInfo() is in the parent class(which is also abstract in this case)
        so, both the class circle and rectangle inherit this method by default
     */
    public void displayInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius){
        /*
            The name is given as the input by the user
            we should call super(name) here because,
            there is a constructor present in the super class with name as a argument in it.
            and we don't have name as the variable in this class
         */
        super(name);
        this.radius = radius;
    }

    public double calculateArea(){
        return (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
}

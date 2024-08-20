package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.animal;


//abstract class
public abstract class Animal {
    private String name;
    private int age;

    //abstract method: this MUST be defined in its subclasses(cat and dog)
    public abstract void makeNoise();

    //normal class(Concrete class)
    //declared and defined here.
    public void stand(){
        System.out.println("Animal is standing");
    }
}

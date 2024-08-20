package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.animal;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        super.stand();
        System.out.println("meow");
    }


}

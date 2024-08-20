package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.animal;

public class AnimalMain {
    public static void main(String[] args) {
        /*
            object of an abstract class cant be created
            //Animal animal = new Animal();
         */

        Cat cat = new Cat();
    //    cat.stand();
        cat.makeNoise();    //includes stand method in it

        System.out.println();

        Dog dog = new Dog();
    //    dog.stand();
        dog.makeNoise();

    }
}

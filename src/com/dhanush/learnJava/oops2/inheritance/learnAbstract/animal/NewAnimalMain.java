package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.animal;

public class NewAnimalMain {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for(Animal pet : animals){
            pet.makeNoise();
        }
    }
}

package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.recipe;

public class ChickenMicrowaveBiriyani extends ChickenBiriyani{

    @Override
    public void getReady() {
        super.getReady();
        System.out.println("switch on the microwave");
    }

    @Override
    public void prepareDish() {
        super.prepareDish();
        System.out.println("put the dish in microwave");
    }

    @Override
    public void cleanUp() {
        super.cleanUp();
        System.out.println("switch off the microwave");
    }

}

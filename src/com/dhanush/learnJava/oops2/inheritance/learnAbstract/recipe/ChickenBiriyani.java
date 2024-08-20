package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.recipe;

public class ChickenBiriyani extends Recipe{

    @Override
    public void getReady() {
        System.out.println("get the chicken and clean it");
    }

    @Override
    public void prepareDish() {
        System.out.println("cook it with all the ingredients");
    }

    @Override
    public void cleanUp() {
        System.out.println("clean up the kitchen");
    }
}

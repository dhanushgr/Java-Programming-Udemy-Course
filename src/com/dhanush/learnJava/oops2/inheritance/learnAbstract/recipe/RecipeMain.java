package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.recipe;

public class RecipeMain {
    public static void main(String[] args) {

        ChickenBiriyani chickenBiriyani = new ChickenBiriyani();
        ChickenMicrowaveBiriyani chickenMicrowaveBiriyani = new ChickenMicrowaveBiriyani();

        /*
            If you didn't write execute method in Recipe class(abstract class)
            then you should execute all these methods
            chickenBiriyani.getReady();
            chickenBiriyani.prepareDish();
            chickenBiriyani.cleanUp();
         */
        chickenBiriyani.execute();

        System.out.println();

        chickenMicrowaveBiriyani.execute();
    }
}

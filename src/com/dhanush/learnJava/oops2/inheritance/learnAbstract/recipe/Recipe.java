package src.com.dhanush.learnJava.oops2.inheritance.learnAbstract.recipe;

public abstract class Recipe {

    //these below methods are abstract methods
    public abstract void getReady();
    public abstract void prepareDish();
    public abstract void cleanUp();

    //this is a concrete method
    //this methods is defined in this class itself
    //@execute it includes all the methods of this class
    public void execute(){
        getReady();
        prepareDish();
        cleanUp();
    }

}

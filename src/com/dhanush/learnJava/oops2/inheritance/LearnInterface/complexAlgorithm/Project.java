package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.complexAlgorithm;

public class Project {
    public static void main(String[] args) {
        /*
            DummyAlgorithm is a subclass of ComplexAlgorithm,
            so ComplexAlgorithm can store DummyAlgorithm
            because its size is either equal or more than DummyAlgorithm

         */

        ComplexAlgorithm algorithm = new DummyAlgorithm();
        //for now they can start working on their algorithm

        System.out.println(algorithm.complexAlgorithm(10,30));

    }
}

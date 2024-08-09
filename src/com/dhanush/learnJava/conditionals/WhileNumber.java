package com.dhanush.learnJava.conditionals;

public class WhileNumber {

    private int limit;

    WhileNumber(){

    }

    public WhileNumber(int limit) {
        this.limit = limit;
    }

    public void printSquaresUptoLimit(){
        int i=0;
        while(i*i<this.limit){
            System.out.println(i*i);
            i++;
        }
    }

    public void printCubesUptoLimit(){
        int i=1;
        while(i*i*i<limit){
            System.out.println(i*i*i);
            i++;
        }

    }

}

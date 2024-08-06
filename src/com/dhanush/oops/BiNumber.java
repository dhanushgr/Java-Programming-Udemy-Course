package com.dhanush.oops;

public class BiNumber {

    int number1;
    int number2;

    //getters and setters
    public int getNumber1() {
        return this.number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    //default constructor
    public BiNumber(){
    }
    //Constructors with args
    public BiNumber(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    int add(){
        return this.number1+this.number2;
    }

    int multiply(){
        return this.number1*this.number2;
    }

    void doubleTheNumber(){
        this.number1 = this.number1*2;      //we could have done just "this.number1*2" rather than assigning it to the value again
        this.number2 = this.number2*2;      //we should return the value which is doubled, so we are assingning it.
    }
    
}

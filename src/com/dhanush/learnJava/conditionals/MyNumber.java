package com.dhanush.learnJava.conditionals;

public class MyNumber {
    private int number;

    //default constructor
    MyNumber() {
    }

    //constructor
    MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        //guard condition
        if (number < 2) {
            return false;
        }
        //loop fo checking is the number prime , if its divisible then its not prime so return false
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  int sumUpToN(){
        int sum = 0;
        if(number>=0){
            for(int i=0; i<=number; i++){
                sum=i+sum;
            }
            return sum;
        }
        return -1;
    }
}
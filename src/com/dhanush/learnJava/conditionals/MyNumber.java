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

    public int sumOfDivisors(){
        int sum = 0;
        if(this.number>=1){
            for(int i=2 ; i<=this.number-1 ; i++){
                if(this.number%i == 0){
                    sum = i + sum;
                }
            }
            return sum;
        }
        return -1;
    }

    public void printNumberTriangle(){
        if(number>=1){
            for(int i=1; i<=number;i++){
                for (int j=1; j<=i; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
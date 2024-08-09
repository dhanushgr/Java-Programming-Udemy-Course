package com.dhanush.learnJava.conditionals;

public class MyNumberMain{
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(7);

        boolean isPrime = myNumber.isPrime();
        System.out.println("isPrime " + isPrime);

        System.out.println(myNumber.sumUpToN());




//        myNumber.isPrime();
//        int sum = number.sumUpToN();
//        int sumOfDivisors = myNumber.sumOfDivisors();
//        myNumber.printANumberTraingle();
    }
}
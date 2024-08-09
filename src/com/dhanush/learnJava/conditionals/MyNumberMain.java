package com.dhanush.learnJava.conditionals;

public class MyNumberMain{
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(4);

        boolean isPrime = myNumber.isPrime();
        System.out.println("isPrime " + isPrime);

        System.out.println("sum up to N is "+ myNumber.sumUpToN());

        System.out.println("sum of divisors are"+myNumber.sumOfDivisors());

        myNumber.printNumberTriangle();

    }
}
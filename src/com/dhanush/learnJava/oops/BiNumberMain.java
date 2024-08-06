package com.dhanush.learnJava.oops;

public class BiNumberMain {
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2,3);

        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());
        numbers.doubleTheNumber();
        System.out.println(numbers.getNumber1());  //this.number1 and 2 , are updated to the new values here because of assigning it.
        System.out.println(numbers.getNumber2());     
    }

}

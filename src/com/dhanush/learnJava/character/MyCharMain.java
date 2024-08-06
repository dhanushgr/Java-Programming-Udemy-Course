package com.dhanush.learnJava.character;

public class MyCharMain {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('c');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

        MyChar.printLowerCaseAlphabets();   //can call a method directly on class if we use static
        MyChar.printUpperCaseAlphabets();   //no need to create a instance for this class, coz we are not getting and input from this class.
    }    
}

package com.dhanush.learnJava.conditionals;

import java.util.Scanner;

public class DoWhileLoopMain {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        do{
            if(number!=0){
                System.out.println("Cube is " + number * number * number); //this should be in the first line so that the cube of negative number is not printed.
            }
            System.out.print("Enter the number: ");                 //this lines read the negative numbers but dont print the 
            number = scanner.nextInt();
        }while(number>=0);
        System.out.println("ThankYou ! HaveFun!");
        
    }
    
}

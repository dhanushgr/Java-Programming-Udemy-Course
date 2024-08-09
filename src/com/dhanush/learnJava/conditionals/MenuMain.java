package com.dhanush.learnJava.conditionals;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 1 ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int number2 = sc.nextInt();

        System.out.println("choices available are:");
        System.out.println("1 - Add");
        System.out.println("2 - sub");
        System.out.println("3 - mul");
        System.out.println("4 - div");

        System.out.println("Enter the choice ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(number1+number2);                
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.err.println(number1/number2);
                break;
            default:
                break;
        }
        
    }

}

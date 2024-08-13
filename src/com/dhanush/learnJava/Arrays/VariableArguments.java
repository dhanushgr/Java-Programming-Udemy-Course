package src.com.dhanush.learnJava.Arrays;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        int[] value = new int[100];     //initialization of array size as 100. array name is value. array type is int
        Arrays.fill(value, 100);        //this initially sets all the elements of the array to 100.
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4,5,6,7)); //this uses variable argument
        System.out.println(sum(value));         //this sums every element in an array
    }

    public static int sum(int i, int j){
        return i+j;
    }

    public static int sum(int i, int j, int k){
        return i+j+k;
    }

//    Instead of writing multiple methods with diff arguments with same functions. In these conditions
//    we should use variable arguments.

    public static int sum(int... values){
        int sum = 0;
        for(int value:values){
            sum = sum + value;
        }
        return sum;
    }

}

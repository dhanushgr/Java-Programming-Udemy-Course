/*using THIS keyword in ENCAPSULATION */

package com.dhanush.oops.encapsulation;

public class Bike {

    // int speed;  --> this is instance variable
    private int speed;  // --> this is MEMBER VARIABLE, private makes this field not accesable by other class. 
 
/*to access this variable you should use a method. Which will eventually take inputs when the method is called in tha main method.
 * not allowing other classes to directly change the field value of this class is called encapsulation.
 * this Encapsulation allows this method to stay private and protects it by other classes(it encapsulated this class).
 */

    int setSpeed(int speed){
        return this.speed;      //same as "System.out.println(speed)"
    }
}

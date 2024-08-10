/*using THIS keyword in ENCAPSULATION */

package src.com.dhanush.learnJava.oops.encapsulation;

public class Bike {

    // int speed;  --> this is instance variable
    private int speed;  // --> this is MEMBER VARIABLE, private makes this field not accesable by other class.

/*to access this variable you should use a method. Which will eventually take inputs when the method is called in tha main method.
 * not allowing other classes to directly change the field value of this class is called encapsulation.
 * this Encapsulation allows this method to stay private and protects it by other classes(it encapsulated this class).
 */
 

    //setter
    void setSpeed(int speed){
         //return this.speed;(if method is int, tred it wont print anything)      //same as "System.out.println(speed)"
         this.speed = speed;        //It assings the value of the local variable to this class's variable
         // System.out.println(speed);
         // System.out.println(this.speed);
        }
        
        //gettter
        int getSpeed(){
            return this.speed;
                            //This is also useful to maintain the Abstraction property: write all the code at one class, and call the required class in the main class. The user dont need to deal with the logic of everything.
                            //This type of methods are created so that in encapsulation this methods() can be called rather than assigning the data to the variable directly.
    }



    //Default Constructor
    Bike(){
        this(5);          //this calls the other constructor with same arguments as given. It calls Bike(int speed)         
                                // OR this.speed=30;              
                                //This Constructor could stay empty or you can set a default value when constructing.
    }

    Bike(int speed){            //This is a Constructor with arguments.
        this.speed= speed;
    }
}

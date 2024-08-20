/*
let's assume Mario released a new game called as NewMario
they have inherited this game from their previous game Mario,
so NewMario is a child class of Mario

new unique feature in this game is while you press down,
he could crouch and also climb down the ladder
 */

package src.com.dhanush.learnJava.oops2.inheritance.LearnInterface.gamingconsole;

public class NewMarioGame extends Mario {

    @Override
    public void down() {
        super.down();
        //System.out.println("If there is a ladder around the character(within 1 meter)");
        System.out.println("climb down the ladder");
    }
}

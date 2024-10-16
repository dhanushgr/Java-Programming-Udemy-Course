package src.com.dhanush.learnJava.ExceptionHandling;

import com.sun.java.accessibility.util.AccessibilityEventMonitor;

/*
    You can extend it with RunTimeException also, then you don't need to
    write "Throws Exception" in every method definition.

    Checked Exception is written when you can solve the problem[our mistakes
    which can be solved]
    Unchecked Exception are written when you can't do anything about the
    problem[eg: memory is full or system crash]
 */

//CustomErrorMessage
class CurrencyNotSameException extends Throwable {
    public CurrencyNotSameException(String message) {
        super(message);
    }
}

class Amounts{
    private String currency;
    private int amount;

    public Amounts(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }

    //a method for adding amount
    /*
        Throwing an Exception instead of RunTimeException, it requires to add
        "throws Exception" in the method because its Checked Exception and
         an Unchecked Exception like RunTimeException
     */
    public void add(Amounts that) throws Exception, CurrencyNotSameException {
        if(!this.currency.equals(that.currency)){
            //throw new Exception(STR."Currencies don't match \{this
            // .currency} & \{that.currency}");
            throw new CurrencyNotSameException(STR."Currencies don't match \{this.currency} & \{that.currency}");
        }
        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return STR."\{currency} \{amount}";
    }

}

public class CustomErrorMessege {
    public static void main(String[] args) throws Exception, CurrencyNotSameException {
        Amounts amount1 = new Amounts(10, "rs");
        Amounts amount2 = new Amounts(20, "usd");
        amount1.add(amount2);
        System.out.println(amount1);
    }
}

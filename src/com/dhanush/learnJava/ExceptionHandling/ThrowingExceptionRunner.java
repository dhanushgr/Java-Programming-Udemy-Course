package src.com.dhanush.learnJava.ExceptionHandling;

import com.sun.java.accessibility.util.AccessibilityEventMonitor;

class Amount{
    private String currency;
    private int amount;

    public Amount(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    //a method for adding amount
    /*
        Throwing an Exception instead of RunTimeException, it requires to add
        "throws Exception" in the method because its Checked Exception and
         an Unchecked Exception like RunTimeException
     */
    public void add(Amount that) throws Exception {
        if(!this.currency.equals(that.currency)){
            throw new Exception(STR."Currencies don't match \{this.currency} & \{that.currency}");
        }
        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return STR."\{currency} \{amount}";
    }

}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amount1 = new Amount(10, "rs");
        Amount amount2 = new Amount(20, "usd");
        amount1.add(amount2);
        System.out.println(amount1);
    }
}

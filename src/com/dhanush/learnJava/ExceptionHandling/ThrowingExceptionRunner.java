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
    public void add(Amount that){
        if(!this.currency.equals(that.currency)){
            throw new RuntimeException("Currencies don't match");
        }
        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return STR."\{currency} \{amount}";
    }

}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {
        Amount amount1 = new Amount(10, "rs");
        Amount amount2 = new Amount(20, "rs");
        amount1.add(amount2);
        System.out.println(amount1);
    }
}

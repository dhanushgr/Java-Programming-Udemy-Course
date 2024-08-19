package src.com.dhanush.learnJava.oops2;

public class Address {
    private String line1;
    private String city;
    private String zip;

    public Address(String city, String line1, String zip) {
        this.city = city;
        this.line1 = line1;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return STR."Address{line1='\{line1}', city='\{city}', zip='\{zip}'}";
    }
}

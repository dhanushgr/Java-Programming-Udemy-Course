package src.com.dhanush.Exercise.Set8;

public class MyStringMain {
    public static void main(String[] args) {
        MyString myString = new MyString("A34cb");
        System.out.println(myString.isHexadecimal());
        System.out.println(myString.isHexadecimalChar('D'));
        System.out.println(myString.isHexadecimalChar('r'));

        MyString myString1 = new MyString("abCL78");
        System.out.println(myString1.isHexadecimal());

    }
}

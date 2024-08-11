//String always should be count from 0 to n , not 1 to n.(this info is required when indexOf like methods are used)
// This below code explains some of the functions that can be performed on string objects.
package src.com.dhanush.learnJava.basic;

public class LearnString {
    public static void main(String[] args) {
        String a = "Hello Guys, I'm Dhanush G R. I'm learning Java";
        System.out.println(a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(12));
        System.out.println(a.substring(9));
        System.out.println(a.substring(12,23));
        System.out.println(a.codePointAt(12));
        System.out.println(a.contains("Dhanush"));
        System.out.println(a.endsWith("va"));
        System.out.println(a.indexOf("u"));
        System.out.println(a.length());     //return the length of the string
        System.out.println(a.concat(" This is my first online course")); //concatinate string with the objects string
        System.out.println(a.trim());       //trims off the extra spaces if present
        System.out.println(Character.isUpperCase('e'));
    }
}
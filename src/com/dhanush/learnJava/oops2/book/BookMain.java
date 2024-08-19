package src.com.dhanush.learnJava.oops2.book;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book(1,"OOP in Java","Ranga");

        Reviews reviews1 = new Reviews(101,"good",4);
        Reviews reviews2 = new Reviews(102, "Awesome",5);

        /*
        can add the review in two types as mentioned
         - create an object of it and then pass that object as an argument to the method.(line:18,19)
         - directly pass the value to the method (line:20)
         */
        book.addReview(reviews1);
        book.addReview(reviews2);
        book.addReview(new Reviews(103, "okay", 3));

        System.out.println(book);

    }
}

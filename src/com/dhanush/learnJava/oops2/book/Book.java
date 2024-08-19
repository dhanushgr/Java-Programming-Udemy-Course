package src.com.dhanush.learnJava.oops2.book;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;
    private ArrayList<Reviews> review = new ArrayList<>();

    public Book(){

    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Reviews reviews){
        this.review.add(reviews);
    }

    @Override
    public String toString() {
        return STR."Book{id=\{id}, name='\{name}', author='\{author}', review=\n\{review}}";
    }
}

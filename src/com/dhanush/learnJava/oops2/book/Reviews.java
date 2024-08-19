package src.com.dhanush.learnJava.oops2.book;

public class Reviews {
    private int id;
    private String description;
    private int rating;

    public Reviews(){

    }

    public Reviews(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return STR."Reviews{id=\{id}, description='\{description}', rating=\{rating}}\n";
    }
}

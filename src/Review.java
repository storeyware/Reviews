// Represents a review, which has two fields: rating, and comment.
// The review class should have a toString() method.
import java.text.DecimalFormat;

public class Review {
    int rating = 0;
    String comment = "Amazing!";

    public Review (int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public String toString() {
        return "Rating: " + rating + " Comment: " + comment;
    }
}

//  contains an ArrayList of Review objects as a list.
import java.util.ArrayList;
import java.util.Scanner;

public class Reviews {
    private ArrayList<Review> reviews; // Collection of Review objects

    public Reviews() {
        reviews = new ArrayList<Review>();
    }

    // Return an ArrayList of all Reviews
    public ArrayList<Review> getAllReviews() {
        ArrayList<Review> result = new ArrayList<Review>();
        for (Review r : reviews) {
            result.add(r);
        }
        return result;
    }

    public int getAverageRating() {
        int average = 0;
        int sum = 0;
        // CALCULATE AVERAGE
        for (Review r : reviews) {
            sum += r.getRating();
        }
        average = sum / reviews.size();

        return average;
    }

    public Review highestReview() {
        Review result = null;
        int highestNum = 0;

        for (Review r : reviews) {
            if (r.getRating() > highestNum) {
                highestNum = r.getRating();
                result = r;
            }
        }
        return result;
    }

    public Review lowestReview() {

        Review result = null;
        int lowestRating = 0;
        for (Review r : reviews) {
            if (lowestRating == 0) {
                lowestRating = r.getRating();
                result = r;
            }
            else if (r.getRating() < lowestRating) {
                lowestRating = r.getRating();
                result = r;
            }
        }
        return result;
    }

    // changed to pass a user int based off of the JUnit test
    public ArrayList<Review> commentsForRating(int num) {
        ArrayList<Review> result = new ArrayList<>();

        for (Review r : reviews) {
            if (r.getRating() == num) {
                result.add(r);
            }
        }
        return result;
    }

    public void addReviews(Review r) {
        reviews.add(r);
    }
}

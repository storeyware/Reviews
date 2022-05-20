//Create a class manager that will create a Reviews Object. The manager will be in charge of
//printing the average rating, highest rating, and lowest rating by calling on those methods using
//the Reviews object. The manager will also be in charge of requesting input from the user
//regarding the last part that ask for a rating and it should call on the method of the Reviews object
//that returns such a list. If you want, you can create two static methods inside your Manager. One
//could populate the Reviews object and the other print the list based on the rating.

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private Reviews reviews;

    public Manager() {
        reviews = new Reviews();}

    public void inputController (Scanner scnr) {
        int rating;         // user rating
        String comment;     // user comment

        System.out.println("Type rating (1-5) followed by any comments. To finish type \"-1\"");

        rating = scnr.nextInt();

        while (rating !=-1) {
            comment = scnr.nextLine();
            reviews.addReviews(new Review(rating, comment));
            rating = scnr.nextInt();
        }
    }

    public void ratingFinderInputController (Scanner scnr) {
        int rating;         // user rating

        rating = scnr.nextInt();

        while (rating !=-1) {
            ArrayList<Review> list = new ArrayList<>();
            list = reviews.commentsForRating(rating);      // list of objects

            for (Review r : list) {
                System.out.println(r);
            }
            rating = scnr.nextInt();                // rating to search for
        }
        System.out.println("Stop");
    }

    public void contentPrinter(ArrayList<Review> list) {
        Scanner scnr = new Scanner(System.in);
        // int ratingToFind;   // input of rating to search for

        System.out.println("Reviews:");
        for (Review review: list) {
            System.out.println(review);
        }

        // calls getAverageRating() from Reviews.java to print out string.
        System.out.println("Average rating: ");
        System.out.println(reviews.getAverageRating());

        // calls highestReview() from Reviews.java to print out string.
        System.out.println("Highest Review:");
        System.out.println(reviews.highestReview());

        // calls getLowestRating() from Reviews.java to print out string.
        System.out.println("Lowest Review:");
        System.out.println(reviews.lowestReview());

        System.out.println("");

        // calls findReview() from Reviews.java to print out string.
        System.out.println("Type rating. To end: -1");

    }

    public static void main(String args[]) {
        ArrayList<Review> reviewList = new ArrayList<>();
        ArrayList<Review> result = new ArrayList<>();
        Scanner scnr = new Scanner(System.in);
        Manager manager = new Manager();
        manager.inputController(scnr);
        reviewList = manager.reviews.getAllReviews();
        manager.contentPrinter(reviewList);
        manager.ratingFinderInputController(scnr);

    }
}

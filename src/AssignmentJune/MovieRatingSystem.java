package AssignmentJune;

public class MovieRatingSystem {
    public static void main(String[] args) {

        String[] movie = {"Leo", "Life of Pie", "Narnia", "Harry Porter", "Lucy"};
        double[] rating = {4,4.5,4.5,5,3.5};

        System.out.println("========== List of movie name and rating ==========");

        for (int i = 0; i < 5; i++) {
            System.out.println(movie[i] + " - " + rating[i]);
            //System.out.println(rating[i]);
        }

        double maxRating = rating[0];
        int maxIndex = 0;

        for (int i = 0; i < rating.length; i++) {
            if (rating[i]>maxRating){
                maxRating =rating[i];
                maxIndex = i;
            }
        }

        System.out.println("========== Highest rated movie ===========");
        System.out.println("Max rating movie name: " + movie[maxIndex]);
        System.out.println("Max rating: " + maxRating + "/5");
    }
}

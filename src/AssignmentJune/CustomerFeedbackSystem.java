package AssignmentJune;

import java.util.Scanner;

public class CustomerFeedbackSystem {
    public static void main(String[] args) {

        String[] feedback = new String[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Customer Feedback Service ==========");

        for (int i = 0; i < feedback.length; i++) {
            System.out.println("Enter your review: ");
            feedback[i] = scanner.nextLine();
        }

        int option;

        do {
            System.out.println("Customer feedback service options");
            System.out.println("1. Display all customer reviews");
            System.out.println("2. Search review with keyword");
            System.out.println("3. Exit");
            System.out.println("Enter your option");
            option = scanner.nextInt();
            scanner.nextLine();
            
            switch (option){
                case 1:
                    displayReview(feedback);
                    break;
                case 2:
                    System.out.println("Enter keyword: ");
                    String keyword = scanner.nextLine();
                    searchKeyword(feedback, keyword);
                    break;
                case 3:
                    System.out.println("Thank you! Welcome again :) ");
                    break;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }while (option != 3);
    }
    
    public static void displayReview(String[] feedback){
        for (int i = 0; i < feedback.length ; i++) {
            System.out.println(feedback[i]);
        }
    }

    public static void searchKeyword(String[] feedback, String keyword){
        boolean found = false;

        for (String review : feedback){
            if (review.toLowerCase().contains(keyword.toLowerCase())){
                System.out.println("Review: " + review);
                found = true;
            }
        }
        if (!found){
            System.out.println("Invalid keyword");
        }
    }
}

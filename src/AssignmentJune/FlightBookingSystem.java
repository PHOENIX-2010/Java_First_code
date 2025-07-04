package AssignmentJune;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class FlightBookingSystem {
    public static void main(String[] args) {

        String[] place = {"India", "Canada", "USA", "Germany", "Egypt"};

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("======== Flight Booking System ========");
            System.out.println("1. Search destination");
            System.out.println("2. Update destination");
            System.out.println("3. exit");
            System.out.println("Enter your option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Enter the destination: ");
                    String destination = scanner.nextLine();
                    searchDestination(place, destination);
                    break;

                case 2:
                    System.out.println("Enter the current destination: ");
                    String oldPlace = scanner.nextLine();
                    System.out.println("Enter the latest destination: ");
                    String newPlace = scanner.nextLine();
                    updateDestination(place, oldPlace, newPlace);
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

    public static void searchDestination(String[] place, String place1){
        boolean found = false;
        for (String des : place){
            if (des.equalsIgnoreCase(place1)){
                System.out.println("Yes, It's available");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Invalid destination");
        }
    }

    public static void updateDestination(String[] place, String oldPlace, String newPlace){
        boolean found = false;
        for (int i = 0; i < place.length; i++) {
            if (place[i].equalsIgnoreCase(oldPlace)){
                place[i] = newPlace;
                System.out.println("Destination updated successfully");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("update fail! Try again.");
        }
    }
}

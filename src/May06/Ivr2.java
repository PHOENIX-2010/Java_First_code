package May06;

import java.util.Scanner;

public class Ivr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Welcome to the Interactive Voice Response");
        System.out.println("=========================================");

        System.out.println("1. English");
        System.out.println("2. French");

        System.out.println("Select the language: ");
        int language = scanner.nextInt();

        if (language == 1){

            System.out.println("==================");
            System.out.println("Options of IVR service");
            System.out.println("==================");

            System.out.println("1. Tech Support");
            System.out.println("2. Billing Help");
            System.out.println("3. Payment Method");
            System.out.println("4. Sales");
            System.out.println("0. Exit");

            System.out.println("Please select the option:");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("This is Tech support process, how may I help you?");
                    break;
                case 2:
                    System.out.println("This is Billing process, how may I help you?");
                    break;
                case 3:
                    System.out.println("This is Payment method process, how may I help you?");
                    break;
                case 4:
                    System.out.println("This Sales team, how may I help you?");
                    break;
                default:
                    System.out.println("Thank you! for calling us...");
            }
        } else if (language == 2){

            System.out.println("==================");
            System.out.println("Options of IVR service");
            System.out.println("==================");

            System.out.println("1. Tech Support");
            System.out.println("2. Billing Help");
            System.out.println("3. Payment Method");
            System.out.println("4. Sales");
            System.out.println("0. Exit");

            System.out.println("Please select the option:");
            int opt1 = scanner.nextInt();

            switch (opt1 ) {
                case 1:
                    System.out.println("This is Tech support process, how may I help you?");
                    break;
                case 2:
                    System.out.println("This is Billing process, how may I help you?");
                    break;
                case 3:
                    System.out.println("This is Payment method process, how may I help you?");
                    break;
                case 4:
                    System.out.println("This Sales team, how may I help you?");
                    break;
                default:
                    System.out.println("Thank you! for calling us...");
            }
        }

    }
}

package May06;

import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Welcome to the Interactive Voice Response");
        System.out.println("=========================================");

        System.out.println("1. English");
        System.out.println("2. French");

        System.out.println("Select the language: ");
        int language = scanner.nextInt();

        switch (language){
            case 1:
                System.out.println("==================");
                System.out.println("Options of IVR service");
                System.out.println("==================");

                System.out.println("1. Tech Support");
                System.out.println("2. Billing Help");
                System.out.println("3. Payment Method");
                System.out.println("4. Sales");
                System.out.println("0. Exit");

                System.out.println("Select the option: ");
                int opt = scanner.nextInt();

                if (opt == 1){
                    System.out.println("This is Tech support process, how may I help you?");
                } else if (opt == 2) {
                    System.out.println("This is Billing process, how may I help you?");
                } else if (opt == 3) {
                    System.out.println("This is Payment method process, how may I help you?");
                } else if (opt == 4) {
                    System.out.println("This Sales team, how may I help you?");
                }else {
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("1. Tech Support");
                System.out.println("2. Billing Help");
                System.out.println("3. Payment Method");
                System.out.println("4. Sales");
                System.out.println("0. Exit");

                System.out.println("Select the option: ");
                int opt2 = scanner.nextInt();

                if (opt2 == 1){
                    System.out.println("This is Tech support process, how may I help you?");
                } else if (opt2 == 2) {
                    System.out.println("This is Billing process, how may I help you?");
                } else if (opt2 == 3) {
                    System.out.println("This is Payment method process, how may I help you?");
                } else if (opt2 == 4) {
                    System.out.println("This Sales team, how may I help you?");
                }else {
                    System.exit(0);
                }
                break;


        }


    }
}

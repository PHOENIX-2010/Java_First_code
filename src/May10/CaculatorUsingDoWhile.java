package May10;

import java.util.Scanner;

public class CaculatorUsingDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cal;

        do {
            System.out.println("Enter the value of num1: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the value of num2: ");
            int num2 = scanner.nextInt();

            System.out.println("====================");
            System.out.println("Calculator");
            System.out.println("====================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");

            System.out.println("Enter the option: ");
            int opt = scanner.nextInt();

            switch(opt){
                case 1:
                    System.out.println("Addition of two number:" + (num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction of two number:" + (num1-num2));
                    break;
                case 3:
                    System.out.println("Multiplication of two number:" + (num1*num2));
                    break;
                case 4:
                    System.out.println("Division of two number:" + ((float)num1/num2));
                    break;
                case 5:
                    System.out.println("Modulus of two number:" +((float)num1%num2));
                    break;
                default:
                    System.exit(0);
                    System.out.println("Invalid option selected.");
            }

            System.out.println("Do you want to calculate more? select Y or N:");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();
            cal = response.equals("yes")|| response.equals("y");

        } while (cal);

        System.out.println("Calculator Closed. Thank you!");

    }
}

package May10;

import java.util.Scanner;

public class CalculatorUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cal;

        do {
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
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    mod();
                    break;
                default:
                    System.exit(0);
//                    System.out.println("Invalid option selected.");
            }

            System.out.println("Do you want to calculate more? select Y or N:");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();
            cal = response.equals("yes") || response.equals("y");

        } while (cal);

        System.out.println("Calculator Closed. Thank you!");

    }

    public static UserInput getinput(){

        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput();

        System.out.println("Enter the value of num1: ");
        userInput.num1 = scanner.nextInt();

        System.out.println("Enter the value of num2: ");
        userInput.num2 = scanner.nextInt();

        return userInput;
    }

    public static void add(){

//
//        System.out.println("Enter the value of num1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter the value of num2: ");
//        int num2 = scanner.nextInt();

        UserInput input = getinput();
        System.out.println("Addition of two number:" + (input.num1+input.num2));
    }

    public static void sub(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value of num1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter the value of num2: ");
//        int num2 = scanner.nextInt();

        UserInput input = getinput();
        System.out.println("Subtraction of two number:" + (input.num1-input.num2));
    }

    public static void mul(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value of num1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter the value of num2: ");
//        int num2 = scanner.nextInt();

        UserInput input = getinput();
        System.out.println("Multiplication of two number:" + (input.num1*input.num2));
    }

    public static void div(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value of num1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter the value of num2: ");
//        int num2 = scanner.nextInt();

        UserInput input = getinput();
        System.out.println("Division of two number:" + ((float)(input.num1/input.num2)));
    }

    public static void mod(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the value of num1: ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter the value of num2: ");
//        int num2 = scanner.nextInt();

        UserInput input = getinput();
        System.out.println("Modulus of two number:" + ((float)(input.num1%input.num2)));
    }

//    public static class UserInput {
//
//        int num1;
//        int num2;
//
//    }
}

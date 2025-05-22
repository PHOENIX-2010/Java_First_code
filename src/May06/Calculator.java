package May06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Enter the value of num1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the value of num2: ");
        int num2 = scanner.nextInt();

        if(opt == 1){

            int add = num1 + num2;
            System.out.println("Addition of two number: " +add);

        } else if (opt == 2) {

            int sub = num1 - num2;
            System.out.println("Subtraction of two number: " +sub);

        } else if (opt == 3) {

            int multi = num1 * num2;
            System.out.println("Multiplication of two number: " +multi);

        } else if (opt == 4) {

            float div = (float) num1 / num2;
            System.out.println("Addition of two number: " +div);

        } else if (opt == 5) {

            float mul = num1 % num2;
            System.out.println("Addition of two number: " + mul);

        } else {
            System.exit(0);
        }
    }
}

package May06;

import java.util.Scanner;

public class Calculatorht {
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

        int num1 = 141;
        int num2 = 2;

        /*System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();*/

        switch (opt){
            case 1:
                int add = num1 + num2;
                System.out.println("Addition of two number is: " +add);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("Subtraction of two number is: " +sub);
                break;
            case 3:
                int multi = num1 * num2;
                System.out.println("Multiplication of two number is: " +multi);
                break;
            case 4:
                float div =(float) num1 / num2;
                System.out.println("Division of two number is: " +div);
                break;
            case 5:
                float mul = (float) num1 % num2;
                System.out.println("Addition of two number is: " +mul);
                break;
            default:
                System.exit(0);
        }
    }
}

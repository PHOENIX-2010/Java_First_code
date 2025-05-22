package May03;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        int c = a + b;
        System.out.println("Sum of two number is :"+c);

    }
}

package May10;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number of factorial:");
        int num = scanner.nextInt();
        int fac = 1;

        for (int i = 1; i <= num ; i++) {
            fac = fac * i;
        }
        System.out.println("Factorial of the num is:" +fac);
    }
}

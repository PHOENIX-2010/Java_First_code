package May10;

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {

//      sum of first n number
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int sum = 0;

        for (int x = 1; x <= n ; x++) {
            sum = sum + x;
            System.out.println(x);
        }
        System.out.println(sum);*/

//      Alphabets

        /*for (char ch = 'a'; ch <= 'z' ; ch++) {
            System.out.println(ch);
        }*/

//      Multiplication Table

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int num = scanner.nextInt();

        for (int x = 1; x <= 10 ; x++) {
            System.out.println(num + "*" + x + "=" + (num*x));
        }

    }
}

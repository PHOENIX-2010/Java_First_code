package May10;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {


//        sum of first n number
     /*   Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();

        int x = 1;
        int sum = 0;

        do {
            System.out.println(x);
            sum = sum + x;
            x++;
        } while (x<=n);
        System.out.println(sum);*/


//        Alphabets
        /*char ch = 'a';

        do {
            System.out.println(ch);
            ch++;
        } while (ch <= 'z');*/


//      Multiplication table
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int num = scanner.nextInt();

        int x = 1;

        do {
            System.out.println(num + "*" + x + "=" + (num*x));
            x++;
        }while (x<=10);

    }
}

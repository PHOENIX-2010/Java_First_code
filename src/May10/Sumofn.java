package May10;

import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n = scanner.nextInt();

        int x = 1;
        int sum = 0;

        while (x<=n){
            System.out.println(x);
            sum = sum + x;
            x++;
        }
        System.out.println(sum);

    }
}

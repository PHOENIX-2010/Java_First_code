package May10;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of table you want: ");
        int num = scanner.nextInt();

        int x = 1;

        while(x<=10){
            System.out.println(num + "*" + x + "=" + (num*x));
            x++;
        }
    }
}

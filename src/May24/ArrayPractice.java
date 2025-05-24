package May24;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the value of array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
//            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

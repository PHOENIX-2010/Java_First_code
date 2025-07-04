package AssignmentJune;

import java.util.Scanner;

public class GroceryStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"Apple", "Banana", "Orange", "Pineapple", "Watermelon"};
        double[] price = {2.5, 1.6, 2.8, 3.2, 2.0};
        int weight;

        System.out.println("Enter the fruit name: ");
        String fruitName = scanner.nextLine();

        System.out.println("How many kg you want?: ");
        double quantity = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruitName)){
                double totalPrice = quantity * price[i];
                System.out.println("Total price for " + fruitName + " : $" + totalPrice);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("fruit not found!");
        }
        scanner.close();
    }

}

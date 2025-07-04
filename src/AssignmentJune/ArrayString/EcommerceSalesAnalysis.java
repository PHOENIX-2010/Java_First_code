package AssignmentJune.ArrayString;

import java.util.Scanner;

public class EcommerceSalesAnalysis {
    public static void main(String[] args) {

        String[] products = {"MacBook Pro", "MacBook Air", "iPad Air", "iPad Pro", "iPhone 16 Pro","iPhone 16 Pro Max", "Airpods Pro"};
        int[] sales = {15,12,18,20,40,35,40};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product name to view total sales: ");
        String productName = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productName)){
                System.out.println("Total sales of " +products[i] + " : " + sales[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Invalid product");
        }
    }
}

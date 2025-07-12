package ExceptionAssignment;

import java.util.*;

public class GroceryException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] code = {"A","B","C","D","E"};
        double[] price = {20.99,15.99,23.99,12.99,30.99};

        double balance = 100;
        double total = 0;

        List<String> items = new ArrayList<>();

        System.out.println("========== Grocery Menu ==========");
        for (int i = 0; i < code.length; i++) {
            System.out.println(code[i]+ " - " + price[i]);
        }

        boolean found = true;

        do{
            System.out.println("Enter item code: ");
            String itemCode = scanner.nextLine().toUpperCase();

            if (itemCode.equalsIgnoreCase("Done")){
                break;
            }

            int index = -1;
            for (int i = 0; i < code.length; i++) {
                if (code[i].equalsIgnoreCase(itemCode)){
                    index = i;
                }

            }
            if (index == -1){
                System.out.println("Invalid item code.");
            }

            double itemPrice = price[index];

            try {
                if (total + itemPrice > balance){
                    throw new InsufficientBalanceException("Insufficient balance and can't add item " + itemCode);
                }

                total = total + itemPrice;
                System.out.println("Added Item: " + itemCode);
                System.out.println(" Total: " + total);
                System.out.println(" Remaining balance: " + (balance-total));

            } catch (InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        } while (!found);

        System.out.println("====================================");
        System.out.println("Final total: " + total);
        System.out.println("Remaining balance: " +(balance-total));
        scanner.close();

    }

}

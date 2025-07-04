package AssignmentJune.ArrayString;

import java.util.Scanner;

public class ProductInventoryManagement {
    String[] products = {"iphone", "ipad", "macbook air", "macbook pro", "apple watch"};
    double[] price = {800, 900, 1200, 1300, 400};

    public void displayAllProducts(){
        System.out.println("Product list: ");
        System.out.println("======================");
        for (int i = 0; i < products.length ; i++) {
            System.out.println(products[i] + " - $" +price[i]);
        }
    }

    public void searchProducts(String product){
        boolean found = false;
        for (int i = 0; i < products.length ; i++) {
            if (products[i].equals(product)){
                System.out.println(products[i] + " - $" +price[i]);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("This product not found");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductInventoryManagement pim = new ProductInventoryManagement();
        pim.displayAllProducts();

        System.out.println("Enter product name: ");
        String searchProduct = scanner.nextLine();

        pim.searchProducts(searchProduct);
    }
}

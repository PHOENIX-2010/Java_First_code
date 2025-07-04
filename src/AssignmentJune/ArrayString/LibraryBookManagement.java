package AssignmentJune.ArrayString;

import java.util.Scanner;

public class LibraryBookManagement {
    public static void main(String[] args) {

        String[] books = {"Harry Porter", "Aladdin", "Lord Shiva", "Narnia", "The Hobbit", "Life of pi"};

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Library Book Management =====");
            System.out.println("1. Find book");
            System.out.println("2. Update book title");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter the book name:");
                String bookTitle = scanner.nextLine();
                findBook(books, bookTitle);
                break;
            } else if (choice == 2) {
                System.out.println("Enter your current book name:");
                String oldTitle = scanner.nextLine();
                System.out.println("Enter the new book name:");
                String newTitle = scanner.nextLine();
                updateTitle(books,oldTitle,newTitle);
                break;
            }
        }while (choice != 3);

        scanner.close();
    }

    public static void findBook(String[] books, String title){
        boolean found = false;
        for (String book : books){
            if (book.equalsIgnoreCase(title)){
                System.out.println("Yes, it's available");
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("This book does not found.");
        }
    }

    public static void updateTitle(String[] books,String oldTitle, String newTitle){
        boolean updated = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(oldTitle)){
                books[i] = newTitle;
                System.out.println("Book title updated successfully.");
                updated = true;
                break;
            }
        }
        if (!updated){
            System.out.println("Update failed. Please try again");
        }
    }
}

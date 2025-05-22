package May20;

public class Library {

    String studentName;
    String bookTitle;
    String Author;
    static int totalBookIssued;

    public Library(String studentName, String bookTitle) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        totalBookIssued++;
    }

    public void printInfo(){
        System.out.println("Student Name: " +studentName);
        System.out.println("Name of the book: " +bookTitle);
    }

    public static void showtotalbook(){
        System.out.println("Total book they issued:" +totalBookIssued);
    }

    public static void main(String[] args) {

        Library library = new Library("Utsav Patel", "Life of Pi");
        library.printInfo();

        System.out.println("============================================");

        Library library1 = new Library("Dhruvi Patel", "Harry potter");
        library1.printInfo();

        System.out.println("============================================");

        Library library2 = new Library("Nand Patel", "Mahabharat");
        library2.printInfo();

        System.out.println("============================================");

        library.showtotalbook();
    }
}

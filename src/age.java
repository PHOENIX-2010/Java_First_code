import java.util.Scanner;

public class age {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your age here: ");
        int age = scanner.nextInt();

        if (age<13){
            System.out.println("Child");
        } else if (age>13 && age<19){
            System.out.println("Teenager");
        } else if (age>20 && age<59){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}

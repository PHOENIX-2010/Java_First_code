package May27;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str =  scanner.next();

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length/2; i++) {
            char temp = 0;
            temp = chars[i];
            chars[i] = chars[chars.length-i-1];
            chars[chars.length-i-1] = temp;
        }

        /*for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }*/

        System.out.println();
        String rev = new String(chars);

        if(str.equals(rev)){
            System.out.println("Yes it is palindrome");
        } else {
            System.out.println("No it is not palindrome");
        }
    }
}
 // r a c e c a r
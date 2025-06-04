package May31;

public class OtherMethods {
    public static void main(String[] args) {

        String doc = "Hello, I am Utsav Patel";
        char[] charArray = doc.toCharArray();

        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(doc.charAt(i))) {
                counter++;
            }
        }
        System.out.println("Number of letters: " +counter);

        int space = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(doc.charAt(i))) {
                space++;
            }
        }
        System.out.println("Number of BlankSpaces: " +space);

        int digit = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(doc.charAt(i))) {
                digit++;
            }
        }
        System.out.println("Number of digits: " +digit);

        int special = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetterOrDigit(doc.charAt(i))) {

            }else if (Character.isWhitespace(doc.charAt(i))){

            }else {
                special++;
            }
        }
        System.out.println("Number of special character: " +special);

        String id = "trainingpragra@pragra.com";

    }
}

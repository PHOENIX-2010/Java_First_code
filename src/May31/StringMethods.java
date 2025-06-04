package May31;

public class StringMethods {
    public static void main(String[] args) {
        /*String s1 = "Utsav";
        String s2 = "Utsav";
        System.out.println(s1.equals(s2));
        char[] charArray = s1.toCharArray();
        System.out.println(s1.length());
        s1.getBytes();*/

        String doc = "The class String includes methods for examining individual characters of the sequence";
        String rep = doc.replace(" ", "");
        System.out.println(rep.length());
        System.out.println("Numbers of words" +doc.split(" ").length);
    }
}

package June21;

public class MainBox {
    public static void main(String[] args) {
        Box<String, Integer> i1 = new Box<>("Apple",6);
        System.out.println(i1);

        System.out.println("=============");

        Box<Integer, String> i2 = new Box<>(12, "Banana");
        System.out.println(i2);

        System.out.println("=============");

        Box<Double, Integer> i3 = new Box<>(12.5,6);
        System.out.println(i3);
    }
}

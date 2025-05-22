package May03;

public class Hometask {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int z = 12;

        if (x>y && x>z){
            System.out.println("X is Greater than y&z");
        } else if (y>z) {
            System.out.println("Y is Greater than x&z");
        } else {
            System.out.println("Z is Greater than x&y");
        }
    }
}
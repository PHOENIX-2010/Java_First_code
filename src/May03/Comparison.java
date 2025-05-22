package May03;

public class Comparison {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;

        /*System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x < a);
        System.out.println(b < y);
        System.out.println(x <= y);
        System.out.println(a >= y);
        System.out.println(x != b);
        System.out.println(x == y);
        System.out.println(a == y);*/

        boolean c1 = !((x<=y) || (x>b));
        System.out.println(c1);
        boolean c2 = (x>y) && (a>348);
        System.out.println(c2);
        boolean c3 = !((x>=y) || (x>a));
        System.out.println(c3);
        boolean c4 = (x>y) && (a>18);
        System.out.println(c4);
        boolean c5 = !((a>=y) || (x>8));
        System.out.println(c5);
        boolean c6 = !((x>y) || (x>23));
        System.out.println(c6);
        boolean c7 = (b>y) && (x>8);
        System.out.println(c7);
        boolean c8 = (x>=y) || (x<=10);
        System.out.println(c8);
        boolean c9 = (x>y) && (x>a);
        System.out.println(c9);
        boolean c10 = !((x==y) || (x<=8));
        System.out.println(c10);




    }


}

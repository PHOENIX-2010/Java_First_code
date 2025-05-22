package May17;

public class Swap {

    public void swapamount(int x, int y){
        System.out.println("Before swap the value of x:"+x+"& Y:" +y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swap the value of x:"+x+"& Y:" +y);
    }

    public static void main(String[] args) {

        Swap swap = new Swap();
        swap.swapamount(10,20);
    }
}



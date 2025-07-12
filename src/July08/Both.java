package July08;

public class Both implements FirstPoint, Second{

    @Override
    public void third() {
        System.out.println("Hello third");
    }

    @Override
    public void one() {
        FirstPoint.super.one();
        Second.super.one();
    }

    /*@Override
    public void one() {
        Second.super.two();
    }*/
}

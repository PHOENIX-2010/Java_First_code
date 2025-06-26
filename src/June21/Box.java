package June21;

public class Box<U,T> {
    private U item1;
    private T item2;

    public Box(U item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public U getItem1() {
        return item1;
    }

    public void setItem1(U item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}

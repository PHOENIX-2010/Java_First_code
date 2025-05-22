package May17;

public class Computer {

    String brand;
    int capacity;

    public Computer() {
        System.out.println("Hello World!");
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
        System.out.println("Hello Pragra!");
    }

    public Computer(String brand, int capacity) {
        this("hp");
        this.brand = brand;
        this.capacity = capacity;
        System.out.println("Hello Student!");
    }
}

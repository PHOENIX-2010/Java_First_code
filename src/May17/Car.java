package May17;

public class Car {

    String name;
    String brand;
    String enginetype;
    String color;
    int hp;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Car(String name, String brand, String enginetype) {
        this.name = name;
        this.brand = brand;
        this.enginetype = enginetype;
    }

    public Car(String name, String brand, String enginetype, String color) {
        this.name = name;
        this.brand = brand;
        this.enginetype = enginetype;
        this.color = color;
    }

    public Car(String name, String brand, String enginetype, String color, int hp) {
        this.name = name;
        this.brand = brand;
        this.enginetype = enginetype;
        this.color = color;
        this.hp = hp;
    }

    public void display(){
        System.out.println("Car name:" +name);
        System.out.println("Brand name:" +brand);
        System.out.println("Engine type:" +enginetype);
        System.out.println("Color:" +color);
        System.out.println("Horsepower:" +hp);
    }
}

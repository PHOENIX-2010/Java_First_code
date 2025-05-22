package May17;

public class CarConstructor {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car ("Sentafe");
        Car car2 = new Car("Creta", "Hyundai");
        Car car3 = new Car("Tucson", "Hyundai", "Turbo");
        Car car4 = new Car("i20", "Hyundai", "Turbo", "White");
        Car car5 = new Car("i10", "Hyundai", "Turbo", "Red", 550);

        System.out.println("=========================");
        car1.display();
        System.out.println("=========================");
        car2.display();
        System.out.println("=========================");
        car3.display();
        System.out.println("=========================");
        car4.display();
        System.out.println("=========================");
        car5.display();
        System.out.println("=========================");

    }

}

package May31;

public class MainVehicles {
    public static void main(String[] args) {

        Honda honda = new Honda();

        honda.brand();
        honda.seatingcapacity();
        honda.accelerate();
        honda.brake();

        System.out.println("============================");

        Suzuki suzuki = new Suzuki();
        suzuki.brand();
        suzuki.seatingcapacity();
        suzuki.accelerate();
        suzuki.brake();
    }
}

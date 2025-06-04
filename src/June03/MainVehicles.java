package June03;

public class MainVehicles {
    public static void main(String[] args) {

        Vehicle honda = new Honda();
        honda.run();
        honda.accelerate();
        honda.stop();

        System.out.println("================");

        Honda hyundai = new Hyundai();
        hyundai.accelerate();


    }
}

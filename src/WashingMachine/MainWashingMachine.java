package WashingMachine;

public class MainWashingMachine {

    public static void main(String[] args) {

        WashingMachine washingmachine = new WashingMachine();

        int[] machine = {1, 0, 5};
        System.out.println("Number of loading count: " + washingmachine.numberOfCloths(machine));
    }
}

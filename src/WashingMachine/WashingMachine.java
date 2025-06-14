package WashingMachine;

public class WashingMachine {

    public int numberOfCloths(int[] machine) {
        int totalCloths = 0;

        for (int cloth : machine) {
            totalCloths = totalCloths + cloth;
        }

        if (totalCloths % machine.length != 0) {
            return -1;
        }

        int total = totalCloths / machine.length;
        int moves = 0;
        int sum = 0;

        for (int i = 0; i < machine.length; i++) {
            int difference = machine[i] - total;
            sum = sum + difference;
            moves = Math.max(moves, Math.max(Math.abs(sum), difference));
        }
        return moves;
    }
}

package June17;

public class MainDrivingException {
    public static void main(String[] args) {

        DrivingException DE = new DrivingException();

        try {
            int age = DrivingException.age(16);
            System.out.println("Your age is not sufficient for driving: " + age);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("last line");

    }
}

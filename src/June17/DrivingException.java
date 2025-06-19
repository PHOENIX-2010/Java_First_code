package June17;

public class DrivingException {
    int age;

    public DrivingException() {
        this.age = age;
    }

    public static int age(int age){
        if (age<=18){
            throw  new InValidAgeException("Insufficient age");
        }
        return age;
    }
}

package May13;

public class PracticeClass {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.color = "Brown";
        dog.weight = 25;
        dog.height = 80;

        System.out.println("===========");
        System.out.println("Dog details");
        System.out.println("===========");
        dog.printdetails();

        dog.eat();
        dog.sleep();
        dog.run();
        dog.walk();

        System.out.println();

        Animal cat = new Animal();
        cat.color = "Black";
        cat.weight = 15;
        cat.height = 50;

        System.out.println("===========");
        System.out.println("Cat details");
        System.out.println("===========");
        cat.printdetails();

        cat.eat();
        cat.sleep();
        cat.run();
        cat.walk();


    }
}

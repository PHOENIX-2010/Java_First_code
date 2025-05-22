package May13;

public class Animal {

    String color;
    int weight;
    int height;

    public void eat(){
        System.out.println("They eat pet food. ;)");
    }

    public void sleep(){
        System.out.println("They sleeps under the dog house.");
    }

    public void run(){
        System.out.println("They run faster.");
    }

    public void walk(){
        System.out.println("They walk funny.");
    }

    public void printdetails(){

        System.out.println("Color:" +color);
        System.out.println("Weight:" +weight+"kg");
        System.out.println("Height:" +height+"cm");
    }

}

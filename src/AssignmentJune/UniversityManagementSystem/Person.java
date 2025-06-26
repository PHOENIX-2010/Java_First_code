package AssignmentJune.UniversityManagementSystem;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
    }

    public final String getType(){ // final method can't be overridden
        return "Person";
    }
}

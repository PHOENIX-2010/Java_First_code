package July08;

public interface First {

    void third();

    default void one(){
        System.out.println("One");
    }
}

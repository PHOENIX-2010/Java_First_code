package June24;

import java.util.*;

public class ListSet {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,55,26,20,12,24,60);

        Set<Integer> set =  new HashSet<>(list);
        Set<Integer> order = new TreeSet<>(set);
        System.out.println(order);

        System.out.println("=================================");

        List<String> name = new LinkedList<>();
        name.add("Utsav");
        name.add("Dharmik");
        name.add("Edward");
        name.add("Sunny");
        name.add("Jasprit");


        List<String> unmodifiableList = Collections.unmodifiableList(name);
        Iterator<String> iterator = unmodifiableList.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("Edward")){
                iterator.remove();
            }
        }
        System.out.println(unmodifiableList);
    }
}
